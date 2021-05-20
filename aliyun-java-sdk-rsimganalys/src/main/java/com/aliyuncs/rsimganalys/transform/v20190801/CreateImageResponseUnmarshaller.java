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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rsimganalys.model.v20190801.CreateImageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateImageResponseUnmarshaller {

	public static CreateImageResponse unmarshall(CreateImageResponse createImageResponse, UnmarshallerContext _ctx) {
		
		createImageResponse.setRequestId(_ctx.stringValue("CreateImageResponse.RequestId"));
		createImageResponse.setResultCode(_ctx.integerValue("CreateImageResponse.ResultCode"));
		createImageResponse.setResultMessage(_ctx.stringValue("CreateImageResponse.ResultMessage"));
		createImageResponse.setImageId(_ctx.stringValue("CreateImageResponse.ImageId"));
		createImageResponse.setUserResolution(_ctx.stringValue("CreateImageResponse.UserResolution"));
		createImageResponse.setPublishStatus(_ctx.integerValue("CreateImageResponse.PublishStatus"));

		List<Integer> items = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("CreateImageResponse.Items.Length"); i++) {
			items.add(_ctx.integerValue("CreateImageResponse.Items["+ i +"]"));
		}
		createImageResponse.setItems(items);
	 
	 	return createImageResponse;
	}
}