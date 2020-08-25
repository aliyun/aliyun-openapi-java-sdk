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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetHelmChartUploadUrlResponse;
import com.aliyuncs.sofa.model.v20190815.GetHelmChartUploadUrlResponse.UploadPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHelmChartUploadUrlResponseUnmarshaller {

	public static GetHelmChartUploadUrlResponse unmarshall(GetHelmChartUploadUrlResponse getHelmChartUploadUrlResponse, UnmarshallerContext _ctx) {
		
		getHelmChartUploadUrlResponse.setRequestId(_ctx.stringValue("GetHelmChartUploadUrlResponse.RequestId"));
		getHelmChartUploadUrlResponse.setResultCode(_ctx.stringValue("GetHelmChartUploadUrlResponse.ResultCode"));
		getHelmChartUploadUrlResponse.setResultMessage(_ctx.stringValue("GetHelmChartUploadUrlResponse.ResultMessage"));

		UploadPolicy uploadPolicy = new UploadPolicy();
		uploadPolicy.setAccessKey(_ctx.stringValue("GetHelmChartUploadUrlResponse.UploadPolicy.AccessKey"));
		uploadPolicy.setBucket(_ctx.stringValue("GetHelmChartUploadUrlResponse.UploadPolicy.Bucket"));
		uploadPolicy.setEndpoint(_ctx.stringValue("GetHelmChartUploadUrlResponse.UploadPolicy.Endpoint"));
		uploadPolicy.setExpire(_ctx.stringValue("GetHelmChartUploadUrlResponse.UploadPolicy.Expire"));
		uploadPolicy.setPathPrefix(_ctx.stringValue("GetHelmChartUploadUrlResponse.UploadPolicy.PathPrefix"));
		uploadPolicy.setPolicy(_ctx.stringValue("GetHelmChartUploadUrlResponse.UploadPolicy.Policy"));
		uploadPolicy.setSignature(_ctx.stringValue("GetHelmChartUploadUrlResponse.UploadPolicy.Signature"));
		getHelmChartUploadUrlResponse.setUploadPolicy(uploadPolicy);
	 
	 	return getHelmChartUploadUrlResponse;
	}
}