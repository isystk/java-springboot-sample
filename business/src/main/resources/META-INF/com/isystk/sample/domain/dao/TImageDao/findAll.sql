--  自動生成のため原則修正禁止!!
SELECT
  /*%expand*/*
FROM
  t_image
WHERE
/*%if criteria.imageIdEq != null */
  IMAGE_ID = /* criteria.imageIdEq */1
/*%end*/
/*%if criteria.imageIdNe != null */
  IMAGE_ID != /* criteria.imageIdNe */1
/*%end*/
/*%if criteria.imageIdLt != null */
  IMAGE_ID < /* criteria.imageIdLt */1
/*%end*/
/*%if criteria.imageIdLe != null */
  IMAGE_ID <= /* criteria.imageIdLe */1
/*%end*/
/*%if criteria.imageIdGt != null */
  IMAGE_ID > /* criteria.imageIdLt */1
/*%end*/
/*%if criteria.imageIdGe != null */
  IMAGE_ID >= /* criteria.imageIdLe */1
/*%end*/
/*%if criteria.imageIdIsNull  */
  IMAGE_ID IS NULL
/*%end*/
/*%if criteria.imageIdIsNotNull  */
  IMAGE_ID IS NOT NULL
/*%end*/
/*%if criteria.imageIdIn != null  */
  IMAGE_ID IN /* criteria.imageIdIn */(1,2,3)
/*%end*/
/*%if criteria.imageIdNotIn != null  */
  IMAGE_ID NOT IN /* criteria.imageIdNotIn */(1,2,3)
/*%end*/
/*%if criteria.registTimeEq != null */
  REGIST_TIME = /* criteria.registTimeEq */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.registTimeNe != null */
  REGIST_TIME != /* criteria.registTimeNe */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.registTimeLt != null */
  REGIST_TIME < /* criteria.registTimeLt */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.registTimeLe != null */
  REGIST_TIME <= /* criteria.registTimeLe */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.registTimeGt != null */
  REGIST_TIME > /* criteria.registTimeLt */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.registTimeGe != null */
  REGIST_TIME >= /* criteria.registTimeLe */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.registTimeIsNull  */
  REGIST_TIME IS NULL
/*%end*/
/*%if criteria.registTimeIsNotNull  */
  REGIST_TIME IS NOT NULL
/*%end*/
/*%if criteria.updateTimeEq != null */
  UPDATE_TIME = /* criteria.updateTimeEq */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.updateTimeNe != null */
  UPDATE_TIME != /* criteria.updateTimeNe */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.updateTimeLt != null */
  UPDATE_TIME < /* criteria.updateTimeLt */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.updateTimeLe != null */
  UPDATE_TIME <= /* criteria.updateTimeLe */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.updateTimeGt != null */
  UPDATE_TIME > /* criteria.updateTimeLt */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.updateTimeGe != null */
  UPDATE_TIME >= /* criteria.updateTimeLe */'2010-01-23 12:34:56'
/*%end*/
/*%if criteria.updateTimeIsNull  */
  UPDATE_TIME IS NULL
/*%end*/
/*%if criteria.updateTimeIsNotNull  */
  UPDATE_TIME IS NOT NULL
/*%end*/
/*%if criteria.deleteFlgTrue  */
  DELETE_FLG = true
/*%end*/
/*%if criteria.deleteFlgFalse  */
  DELETE_FLG = false
/*%end*/
