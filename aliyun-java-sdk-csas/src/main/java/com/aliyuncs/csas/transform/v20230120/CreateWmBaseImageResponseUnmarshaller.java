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

package com.aliyuncs.csas.transform.v20230120;

import com.aliyuncs.csas.model.v20230120.CreateWmBaseImageResponse;
import com.aliyuncs.csas.model.v20230120.CreateWmBaseImageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWmBaseImageResponseUnmarshaller {

	public static CreateWmBaseImageResponse unmarshall(CreateWmBaseImageResponse createWmBaseImageResponse, UnmarshallerContext _ctx) {
		
		createWmBaseImageResponse.setRequestId(_ctx.stringValue("CreateWmBaseImageResponse.RequestId"));

		Data data = new Data();
		data.setImageId(_ctx.stringValue("CreateWmBaseImageResponse.Data.ImageId"));
		data.setImageUrl(_ctx.stringValue("CreateWmBaseImageResponse.Data.ImageUrl"));
		data.setImageUrlExp(_ctx.longValue("CreateWmBaseImageResponse.Data.ImageUrlExp"));
		createWmBaseImageResponse.setData(data);
	 
	 	return createWmBaseImageResponse;
	}
}