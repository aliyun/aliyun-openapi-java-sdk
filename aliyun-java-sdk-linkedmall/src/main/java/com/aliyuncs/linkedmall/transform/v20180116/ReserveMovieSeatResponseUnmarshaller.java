/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.ReserveMovieSeatResponse;
import com.aliyuncs.linkedmall.model.v20180116.ReserveMovieSeatResponse.ReservedSeat;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReserveMovieSeatResponseUnmarshaller {

	public static ReserveMovieSeatResponse unmarshall(ReserveMovieSeatResponse reserveMovieSeatResponse, UnmarshallerContext context) {
		
		reserveMovieSeatResponse.setRequestId(context.stringValue("ReserveMovieSeatResponse.RequestId"));
		reserveMovieSeatResponse.setCode(context.stringValue("ReserveMovieSeatResponse.Code"));
		reserveMovieSeatResponse.setMessage(context.stringValue("ReserveMovieSeatResponse.Message"));
		reserveMovieSeatResponse.setSubCode(context.stringValue("ReserveMovieSeatResponse.SubCode"));
		reserveMovieSeatResponse.setSubMessage(context.stringValue("ReserveMovieSeatResponse.SubMessage"));
		reserveMovieSeatResponse.setLogsId(context.stringValue("ReserveMovieSeatResponse.LogsId"));
		reserveMovieSeatResponse.setSuccess(context.booleanValue("ReserveMovieSeatResponse.Success"));

		ReservedSeat reservedSeat = new ReservedSeat();
		reservedSeat.setApplyKey(context.stringValue("ReserveMovieSeatResponse.ReservedSeat.ApplyKey"));
		reservedSeat.setDefaultLockSecond(context.longValue("ReserveMovieSeatResponse.ReservedSeat.DefaultLockSecond"));
		reservedSeat.setReservedTime(context.longValue("ReserveMovieSeatResponse.ReservedSeat.ReservedTime"));
		reservedSeat.setStatus(context.stringValue("ReserveMovieSeatResponse.ReservedSeat.Status"));
		reserveMovieSeatResponse.setReservedSeat(reservedSeat);
	 
	 	return reserveMovieSeatResponse;
	}
}