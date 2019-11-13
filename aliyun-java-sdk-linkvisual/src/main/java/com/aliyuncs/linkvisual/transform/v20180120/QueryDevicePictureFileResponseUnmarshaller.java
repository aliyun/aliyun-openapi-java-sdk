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

import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePictureFileResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePictureFileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePictureFileResponseUnmarshaller {

	public static QueryDevicePictureFileResponse unmarshall(QueryDevicePictureFileResponse queryDevicePictureFileResponse, UnmarshallerContext _ctx) {
		
		queryDevicePictureFileResponse.setRequestId(_ctx.stringValue("QueryDevicePictureFileResponse.RequestId"));
		queryDevicePictureFileResponse.setSuccess(_ctx.booleanValue("QueryDevicePictureFileResponse.Success"));
		queryDevicePictureFileResponse.setErrorMessage(_ctx.stringValue("QueryDevicePictureFileResponse.ErrorMessage"));
		queryDevicePictureFileResponse.setCode(_ctx.stringValue("QueryDevicePictureFileResponse.Code"));

		Data data = new Data();
		data.setIotId(_ctx.stringValue("QueryDevicePictureFileResponse.Data.IotId"));
		data.setPicCreateTime(_ctx.longValue("QueryDevicePictureFileResponse.Data.PicCreateTime"));
		data.setPicId(_ctx.stringValue("QueryDevicePictureFileResponse.Data.PicId"));
		data.setPicUrl(_ctx.stringValue("QueryDevicePictureFileResponse.Data.PicUrl"));
		data.setThumbUrl(_ctx.stringValue("QueryDevicePictureFileResponse.Data.ThumbUrl"));
		queryDevicePictureFileResponse.setData(data);
	 
	 	return queryDevicePictureFileResponse;
	}
}