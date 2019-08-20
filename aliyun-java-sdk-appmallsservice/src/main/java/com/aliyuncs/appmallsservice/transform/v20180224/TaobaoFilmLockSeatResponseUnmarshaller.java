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

package com.aliyuncs.appmallsservice.transform.v20180224;

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmLockSeatResponse;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmLockSeatResponse.SeatLocked;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmLockSeatResponseUnmarshaller {

	public static TaobaoFilmLockSeatResponse unmarshall(TaobaoFilmLockSeatResponse taobaoFilmLockSeatResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmLockSeatResponse.setRequestId(_ctx.stringValue("TaobaoFilmLockSeatResponse.RequestId"));
		taobaoFilmLockSeatResponse.setErrorCode(_ctx.stringValue("TaobaoFilmLockSeatResponse.ErrorCode"));
		taobaoFilmLockSeatResponse.setMsg(_ctx.stringValue("TaobaoFilmLockSeatResponse.Msg"));
		taobaoFilmLockSeatResponse.setSubCode(_ctx.stringValue("TaobaoFilmLockSeatResponse.SubCode"));
		taobaoFilmLockSeatResponse.setSubMsg(_ctx.stringValue("TaobaoFilmLockSeatResponse.SubMsg"));
		taobaoFilmLockSeatResponse.setLogsId(_ctx.stringValue("TaobaoFilmLockSeatResponse.LogsId"));

		SeatLocked seatLocked = new SeatLocked();
		seatLocked.setApplyKey(_ctx.stringValue("TaobaoFilmLockSeatResponse.SeatLocked.ApplyKey"));
		seatLocked.setDefaultLockSecond(_ctx.longValue("TaobaoFilmLockSeatResponse.SeatLocked.DefaultLockSecond"));
		seatLocked.setLockTime(_ctx.longValue("TaobaoFilmLockSeatResponse.SeatLocked.LockTime"));
		seatLocked.setStatus(_ctx.stringValue("TaobaoFilmLockSeatResponse.SeatLocked.Status"));
		taobaoFilmLockSeatResponse.setSeatLocked(seatLocked);
	 
	 	return taobaoFilmLockSeatResponse;
	}
}