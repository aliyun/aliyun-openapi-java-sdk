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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.SaveRTCStatsV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveRTCStatsV2ResponseUnmarshaller {

	public static SaveRTCStatsV2Response unmarshall(SaveRTCStatsV2Response saveRTCStatsV2Response, UnmarshallerContext _ctx) {
		
		saveRTCStatsV2Response.setRequestId(_ctx.stringValue("SaveRTCStatsV2Response.RequestId"));
		saveRTCStatsV2Response.setCode(_ctx.stringValue("SaveRTCStatsV2Response.Code"));
		saveRTCStatsV2Response.setHttpStatusCode(_ctx.longValue("SaveRTCStatsV2Response.HttpStatusCode"));
		saveRTCStatsV2Response.setMessage(_ctx.stringValue("SaveRTCStatsV2Response.Message"));
		saveRTCStatsV2Response.setRowCount(_ctx.longValue("SaveRTCStatsV2Response.RowCount"));
		saveRTCStatsV2Response.setSuccess(_ctx.booleanValue("SaveRTCStatsV2Response.Success"));
		saveRTCStatsV2Response.setTimeStamp(_ctx.longValue("SaveRTCStatsV2Response.TimeStamp"));
	 
	 	return saveRTCStatsV2Response;
	}
}