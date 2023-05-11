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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GetSoundCodeScheduleResponse;
import com.aliyuncs.iot.model.v20180120.GetSoundCodeScheduleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSoundCodeScheduleResponseUnmarshaller {

	public static GetSoundCodeScheduleResponse unmarshall(GetSoundCodeScheduleResponse getSoundCodeScheduleResponse, UnmarshallerContext _ctx) {
		
		getSoundCodeScheduleResponse.setRequestId(_ctx.stringValue("GetSoundCodeScheduleResponse.RequestId"));
		getSoundCodeScheduleResponse.setSuccess(_ctx.booleanValue("GetSoundCodeScheduleResponse.Success"));
		getSoundCodeScheduleResponse.setCode(_ctx.stringValue("GetSoundCodeScheduleResponse.Code"));
		getSoundCodeScheduleResponse.setErrorMessage(_ctx.stringValue("GetSoundCodeScheduleResponse.ErrorMessage"));

		Data data = new Data();
		data.setScheduleCode(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.ScheduleCode"));
		data.setName(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.Description"));
		data.setGmtCreate(_ctx.longValue("GetSoundCodeScheduleResponse.Data.GmtCreate"));
		data.setStatus(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.Status"));
		data.setStartTime(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.StartTime"));
		data.setEndTime(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.EndTime"));
		data.setStartDate(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.StartDate"));
		data.setEndDate(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.EndDate"));
		data.setOpenType(_ctx.stringValue("GetSoundCodeScheduleResponse.Data.OpenType"));
		getSoundCodeScheduleResponse.setData(data);
	 
	 	return getSoundCodeScheduleResponse;
	}
}