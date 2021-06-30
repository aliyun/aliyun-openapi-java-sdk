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

package com.aliyuncs.workbench_inner.transform.v20210121;

import com.aliyuncs.workbench_inner.model.v20210121.InnerGetAppPackageUploadUrlResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGetAppPackageUploadUrlResponseUnmarshaller {

	public static InnerGetAppPackageUploadUrlResponse unmarshall(InnerGetAppPackageUploadUrlResponse innerGetAppPackageUploadUrlResponse, UnmarshallerContext _ctx) {
		
		innerGetAppPackageUploadUrlResponse.setRequestId(_ctx.stringValue("InnerGetAppPackageUploadUrlResponse.RequestId"));
		innerGetAppPackageUploadUrlResponse.setCode(_ctx.stringValue("InnerGetAppPackageUploadUrlResponse.Code"));
		innerGetAppPackageUploadUrlResponse.setData(_ctx.mapValue("InnerGetAppPackageUploadUrlResponse.Data"));
		innerGetAppPackageUploadUrlResponse.setMessage(_ctx.stringValue("InnerGetAppPackageUploadUrlResponse.Message"));
	 
	 	return innerGetAppPackageUploadUrlResponse;
	}
}