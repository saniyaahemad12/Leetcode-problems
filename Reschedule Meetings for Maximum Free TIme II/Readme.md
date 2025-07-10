# Reschedule Meetings For Maximum Free Time II

You are given an integer eventTime denoting the duration of an event. You are also given two integer arrays startTime and endTime, each of length n.

These represent the start and end times of n non-overlapping meetings that occur during the event between time t = 0 and time t = eventTime, where the ith meeting occurs during the time [startTime[i], endTime[i]].

You can reschedule at most one meeting by moving its start time while maintaining the same duration, such that the meetings remain non-overlapping, to maximize the longest continuous period of free time during the event.

Return the maximum amount of free time possible after rearranging the meetings.

Note that the meetings can not be rescheduled to a time outside the event and they should remain non-overlapping.

Note: In this version, it is valid for the relative ordering of the meetings to change after rescheduling one meeting.

 

## Example 1:

Input: eventTime = 5, startTime = [1,3], endTime = [2,5]

Output: 2

Explanation: 

<img width="326" height="107" alt="image" src="https://github.com/user-attachments/assets/62dd8d7d-539f-494d-8f58-758c11927358" />

Reschedule the meeting at [1, 2] to [2, 3], leaving no meetings during the time [0, 2].

## Example 2:

Input: eventTime = 10, startTime = [0,7,9], endTime = [1,8,10]

Output: 7

Explanation: 

<img width="340" height="115" alt="image" src="https://github.com/user-attachments/assets/efa96e9b-5b74-4c75-ab36-7d50c1ca5ab1" />

Reschedule the meeting at [0, 1] to [8, 9], leaving no meetings during the time [0, 7].

## Example 3:

Input: eventTime = 10, startTime = [0,3,7,9], endTime = [1,4,8,10]

Output: 6

Explanation: 

<img width="335" height="109" alt="image" src="https://github.com/user-attachments/assets/cff11087-c3a1-46fa-b38d-c86bad9e53a3" />

Reschedule the meeting at [3, 4] to [8, 9], leaving no meetings during the time [1, 7].

## Example 4:

Input: eventTime = 5, startTime = [0,1,2,3,4], endTime = [1,2,3,4,5]

Output: 0

Explanation:

There is no time during the event not occupied by meetings.

 

## Constraints:

1 <= eventTime <= 109

n == startTime.length == endTime.length

2 <= n <= 105

0 <= startTime[i] < endTime[i] <= eventTime

endTime[i] <= startTime[i + 1] where i lies in the range [0, n - 2].


