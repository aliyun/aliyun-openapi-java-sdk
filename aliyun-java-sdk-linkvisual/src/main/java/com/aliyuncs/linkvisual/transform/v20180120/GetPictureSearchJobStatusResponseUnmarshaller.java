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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.GetPictureSearchJobStatusResponse;
import com.aliyuncs.linkvisual.model.v20180120.GetPictureSearchJobStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPictureSearchJobStatusResponseUnmarshaller {

	public static GetPictureSearchJobStatusResponse unmarshall(GetPictureSearchJobStatusResponse getPictureSearchJobStatusResponse, UnmarshallerContext _ctx) {
		
		getPictureSearchJobStatusResponse.setRequestId(_ctx.stringValue("GetPictureSearchJobStatusResponse.RequestId"));
		getPictureSearchJobStatusResponse.setSuccess(_ctx.booleanValue("GetPictureSearchJobStatusResponse.Success"));
		getPictureSearchJobStatusResponse.setCode(_ctx.stringValue("GetPictureSearchJobStatusResponse.Code"));
		getPictureSearchJobStatusResponse.setErrorMessage(_ctx.stringValue("GetPictureSearchJobStatusResponse.ErrorMessage"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("GetPictureSearchJobStatusResponse.Data.JobId"));
		data.setJobStatus(_ctx.integerValue("GetPictureSearchJobStatusResponse.Data.JobStatus"));
		data.setSearchPicUrl(_ctx.stringValue("GetPictureSearchJobStatusResponse.Data.SearchPicUrl"));
		data.setStartTime(_ctx.longValue("GetPictureSearchJobStatusResponse.Data.StartTime"));
		data.setEndTime(_ctx.longValue("GetPictureSearchJobStatusResponse.Data.EndTime"));
		data.setThreshold(_ctx.floatValue("GetPictureSearchJobStatusResponse.Data.Threshold"));
		data.setCreateTime(_ctx.longValue("GetPictureSearchJobStatusResponse.Data.CreateTime"));
		getPictureSearchJobStatusResponse.setData(data);
	 
	 	return getPictureSearchJobStatusResponse;
	}
}