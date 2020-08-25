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

import com.aliyuncs.sofa.model.v20190815.ModifyBuildpackResponse;
import com.aliyuncs.sofa.model.v20190815.ModifyBuildpackResponse.UploadEndpointsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBuildpackResponseUnmarshaller {

	public static ModifyBuildpackResponse unmarshall(ModifyBuildpackResponse modifyBuildpackResponse, UnmarshallerContext _ctx) {
		
		modifyBuildpackResponse.setRequestId(_ctx.stringValue("ModifyBuildpackResponse.RequestId"));
		modifyBuildpackResponse.setResultCode(_ctx.stringValue("ModifyBuildpackResponse.ResultCode"));
		modifyBuildpackResponse.setResultMessage(_ctx.stringValue("ModifyBuildpackResponse.ResultMessage"));
		modifyBuildpackResponse.setBuildpackId(_ctx.stringValue("ModifyBuildpackResponse.BuildpackId"));

		List<UploadEndpointsItem> uploadEndpoints = new ArrayList<UploadEndpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyBuildpackResponse.UploadEndpoints.Length"); i++) {
			UploadEndpointsItem uploadEndpointsItem = new UploadEndpointsItem();
			uploadEndpointsItem.setAccessKeyId(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].AccessKeyId"));
			uploadEndpointsItem.setBucket(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].Bucket"));
			uploadEndpointsItem.setEncodedPolicy(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].EncodedPolicy"));
			uploadEndpointsItem.setExpiration(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].Expiration"));
			uploadEndpointsItem.setFilePath(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].FilePath"));
			uploadEndpointsItem.setHost(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].Host"));
			uploadEndpointsItem.setRegionId(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].RegionId"));
			uploadEndpointsItem.setSignature(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].Signature"));
			uploadEndpointsItem.setStorageType(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].StorageType"));
			uploadEndpointsItem.setUrl(_ctx.stringValue("ModifyBuildpackResponse.UploadEndpoints["+ i +"].Url"));

			uploadEndpoints.add(uploadEndpointsItem);
		}
		modifyBuildpackResponse.setUploadEndpoints(uploadEndpoints);
	 
	 	return modifyBuildpackResponse;
	}
}