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

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmUnLockSeatResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmUnLockSeatResponseUnmarshaller {

	public static TaobaoFilmUnLockSeatResponse unmarshall(TaobaoFilmUnLockSeatResponse taobaoFilmUnLockSeatResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmUnLockSeatResponse.setRequestId(_ctx.stringValue("TaobaoFilmUnLockSeatResponse.RequestId"));
		taobaoFilmUnLockSeatResponse.setErrorCode(_ctx.stringValue("TaobaoFilmUnLockSeatResponse.ErrorCode"));
		taobaoFilmUnLockSeatResponse.setMsg(_ctx.stringValue("TaobaoFilmUnLockSeatResponse.Msg"));
		taobaoFilmUnLockSeatResponse.setSubCode(_ctx.stringValue("TaobaoFilmUnLockSeatResponse.SubCode"));
		taobaoFilmUnLockSeatResponse.setSubMsg(_ctx.stringValue("TaobaoFilmUnLockSeatResponse.SubMsg"));
		taobaoFilmUnLockSeatResponse.setReturnCode(_ctx.stringValue("TaobaoFilmUnLockSeatResponse.ReturnCode"));
		taobaoFilmUnLockSeatResponse.setReturnMessage(_ctx.stringValue("TaobaoFilmUnLockSeatResponse.ReturnMessage"));
		taobaoFilmUnLockSeatResponse.setReturnValue(_ctx.booleanValue("TaobaoFilmUnLockSeatResponse.ReturnValue"));
		taobaoFilmUnLockSeatResponse.setLogsId(_ctx.stringValue("TaobaoFilmUnLockSeatResponse.LogsId"));
	 
	 	return taobaoFilmUnLockSeatResponse;
	}
}