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

package com.aliyuncs.imagesearch.transform.v20190325;

import com.aliyuncs.imagesearch.model.v20190325.AddImageResponse;
import com.aliyuncs.imagesearch.model.v20190325.AddImageResponse.PicInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddImageResponseUnmarshaller {

	public static AddImageResponse unmarshall(AddImageResponse addImageResponse, UnmarshallerContext context) {
		
		addImageResponse.setRequestId(context.stringValue("AddImageResponse.RequestId"));
		addImageResponse.setSuccess(context.booleanValue("AddImageResponse.Success"));
		addImageResponse.setMessage(context.stringValue("AddImageResponse.Message"));
		addImageResponse.setCode(context.integerValue("AddImageResponse.Code"));

		PicInfo picInfo = new PicInfo();
		picInfo.setCategoryId(context.integerValue("AddImageResponse.PicInfo.CategoryId"));
		picInfo.setRegion(context.stringValue("AddImageResponse.PicInfo.Region"));
		addImageResponse.setPicInfo(picInfo);
	 
	 	return addImageResponse;
	}
}