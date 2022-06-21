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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetSystemImagesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSystemImagesResponseUnmarshaller {

	public static GetSystemImagesResponse unmarshall(GetSystemImagesResponse getSystemImagesResponse, UnmarshallerContext _ctx) {
		
		getSystemImagesResponse.setRequestId(_ctx.stringValue("GetSystemImagesResponse.RequestId"));
		getSystemImagesResponse.setIsSuccess(_ctx.booleanValue("GetSystemImagesResponse.IsSuccess"));
		getSystemImagesResponse.setSystemImages(_ctx.stringValue("GetSystemImagesResponse.SystemImages"));
		getSystemImagesResponse.setCode(_ctx.stringValue("GetSystemImagesResponse.Code"));
	 
	 	return getSystemImagesResponse;
	}
}