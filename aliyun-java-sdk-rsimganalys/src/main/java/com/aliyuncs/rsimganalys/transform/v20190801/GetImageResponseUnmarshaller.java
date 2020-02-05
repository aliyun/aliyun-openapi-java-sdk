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

import com.aliyuncs.rsimganalys.model.v20190801.GetImageResponse;
import com.aliyuncs.rsimganalys.model.v20190801.GetImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageResponseUnmarshaller {

	public static GetImageResponse unmarshall(GetImageResponse getImageResponse, UnmarshallerContext _ctx) {
		
		getImageResponse.setRequestId(_ctx.stringValue("GetImageResponse.RequestId"));
		getImageResponse.setResultCode(_ctx.stringValue("GetImageResponse.ResultCode"));
		getImageResponse.setResultMessage(_ctx.stringValue("GetImageResponse.ResultMessage"));
		getImageResponse.setDownloadPath(_ctx.stringValue("GetImageResponse.DownloadPath"));

		Data data = new Data();
		data.setImageName(_ctx.stringValue("GetImageResponse.Data.ImageName"));
		data.setAppkey(_ctx.stringValue("GetImageResponse.Data.Appkey"));
		data.setFileTime(_ctx.longValue("GetImageResponse.Data.FileTime"));
		data.setDescription(_ctx.stringValue("GetImageResponse.Data.Description"));
		data.setAliyunPK(_ctx.stringValue("GetImageResponse.Data.AliyunPK"));
		data.setRunStatus(_ctx.integerValue("GetImageResponse.Data.RunStatus"));
		getImageResponse.setData(data);
	 
	 	return getImageResponse;
	}
}