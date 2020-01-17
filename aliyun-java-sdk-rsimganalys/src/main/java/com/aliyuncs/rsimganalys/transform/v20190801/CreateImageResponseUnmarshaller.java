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

package com.aliyuncs.rsimganalys.transform.v20190801;

import com.aliyuncs.rsimganalys.model.v20190801.CreateImageResponse;
import com.aliyuncs.rsimganalys.model.v20190801.CreateImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateImageResponseUnmarshaller {

	public static CreateImageResponse unmarshall(CreateImageResponse createImageResponse, UnmarshallerContext _ctx) {
		
		createImageResponse.setRequestId(_ctx.stringValue("CreateImageResponse.RequestId"));
		createImageResponse.setResultCode(_ctx.integerValue("CreateImageResponse.ResultCode"));
		createImageResponse.setImageId(_ctx.stringValue("CreateImageResponse.ImageId"));
		createImageResponse.setResultMessage(_ctx.stringValue("CreateImageResponse.ResultMessage"));

		Data data = new Data();
		data.setAliyunPK(_ctx.stringValue("CreateImageResponse.Data.AliyunPK"));
		data.setDescription(_ctx.stringValue("CreateImageResponse.Data.Description"));
		data.setDownloadPath(_ctx.stringValue("CreateImageResponse.Data.DownloadPath"));
		data.setGmtCreate(_ctx.stringValue("CreateImageResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("CreateImageResponse.Data.GmtModified"));
		data.setImageId(_ctx.integerValue("CreateImageResponse.Data.ImageId"));
		data.setJobId(_ctx.stringValue("CreateImageResponse.Data.JobId"));
		data.setImageName(_ctx.stringValue("CreateImageResponse.Data.ImageName"));
		data.setRunStatus(_ctx.integerValue("CreateImageResponse.Data.RunStatus"));
		data.setUrlUploadPath(_ctx.stringValue("CreateImageResponse.Data.UrlUploadPath"));
		data.setFileTime(_ctx.longValue("CreateImageResponse.Data.FileTime"));
		data.setStatusCode(_ctx.stringValue("CreateImageResponse.Data.StatusCode"));
		data.setStatusMessage(_ctx.stringValue("CreateImageResponse.Data.StatusMessage"));
		createImageResponse.setData(data);
	 
	 	return createImageResponse;
	}
}