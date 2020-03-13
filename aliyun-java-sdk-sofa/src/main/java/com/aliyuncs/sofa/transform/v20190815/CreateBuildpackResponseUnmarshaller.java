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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.CreateBuildpackResponse;
import com.aliyuncs.sofa.model.v20190815.CreateBuildpackResponse.UploadEndpointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBuildpackResponseUnmarshaller {

	public static CreateBuildpackResponse unmarshall(CreateBuildpackResponse createBuildpackResponse, UnmarshallerContext _ctx) {
		
		createBuildpackResponse.setRequestId(_ctx.stringValue("CreateBuildpackResponse.RequestId"));
		createBuildpackResponse.setResultCode(_ctx.stringValue("CreateBuildpackResponse.ResultCode"));
		createBuildpackResponse.setResultMessage(_ctx.stringValue("CreateBuildpackResponse.ResultMessage"));
		createBuildpackResponse.setBuildpackId(_ctx.stringValue("CreateBuildpackResponse.BuildpackId"));

		List<UploadEndpointsItem> uploadEndpoints = new ArrayList<UploadEndpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateBuildpackResponse.UploadEndpoints.Length"); i++) {
			UploadEndpointsItem uploadEndpointsItem = new UploadEndpointsItem();
			uploadEndpointsItem.setAccessKeyId(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].AccessKeyId"));
			uploadEndpointsItem.setBucket(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].Bucket"));
			uploadEndpointsItem.setEncodedPolicy(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].EncodedPolicy"));
			uploadEndpointsItem.setExpiration(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].Expiration"));
			uploadEndpointsItem.setFilePath(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].FilePath"));
			uploadEndpointsItem.setHost(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].Host"));
			uploadEndpointsItem.setRegionId(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].RegionId"));
			uploadEndpointsItem.setSignature(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].Signature"));
			uploadEndpointsItem.setStorageType(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].StorageType"));
			uploadEndpointsItem.setUrl(_ctx.stringValue("CreateBuildpackResponse.UploadEndpoints["+ i +"].Url"));

			uploadEndpoints.add(uploadEndpointsItem);
		}
		createBuildpackResponse.setUploadEndpoints(uploadEndpoints);
	 
	 	return createBuildpackResponse;
	}
}