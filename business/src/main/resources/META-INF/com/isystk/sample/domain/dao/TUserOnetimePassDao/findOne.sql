SELECT
  /*%expand*/*
FROM
  t_user_onetime_pass
WHERE
/*%if criteria.userIdEqual != null */
  USER_ID = /* criteria.userIdEqual */1
/*%end*/
/*%if criteria.userIdNotEqual != null */
  USER_ID != /* criteria.userIdNotEqual */1
/*%end*/
/*%if criteria.userIdIsNull  */
  USER_ID IS NULL
/*%end*/
/*%if criteria.userIdIsNotNull  */
  USER_ID IS NOT NULL
/*%end*/
/*%if criteria.userIdIn != null  */
  USER_ID IN /* criteria.userIdIn */(1,2,3)
/*%end*/
/*%if criteria.userIdNotIn != null  */
  USER_ID NOT IN /* criteria.userIdNotIn */(1,2,3)
/*%end*/
/*%if criteria.onetimeKeyEqual != null */
  ONETIME_KEY = /* criteria.onetimeKeyEqual */'a'
/*%end*/
/*%if criteria.onetimeKeyNotEqual != null */
  ONETIME_KEY != /* criteria.onetimeKeyNotEqual */'a'
/*%end*/
/*%if criteria.onetimeKeyIsNull  */
  ONETIME_KEY IS NULL
/*%end*/
/*%if criteria.onetimeKeyIsNotNull  */
  ONETIME_KEY IS NOT NULL
/*%end*/
/*%if criteria.onetimeKeyLike != null  */
  ONETIME_KEY LIKE /* @infix(criteria.onetimeKeyLike) */'smith'
/*%end*/
/*%if criteria.onetimeValidTimeEqual != null */
  ONETIME_VALID_TIME = /* criteria.onetimeValidTimeEqual */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.onetimeValidTimeNotEqual != null */
  ONETIME_VALID_TIME != /* criteria.onetimeValidTimeNotEqual */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.onetimeValidTimeIsNull  */
  ONETIME_VALID_TIME IS NULL
/*%end*/
/*%if criteria.onetimeValidTimeIsNotNull  */
  ONETIME_VALID_TIME IS NOT NULL
/*%end*/
