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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.CreateProductTagsResponse;
import com.aliyuncs.iot.model.v20180120.CreateProductTagsResponse.ProductTag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProductTagsResponseUnmarshaller {

	public static CreateProductTagsResponse unmarshall(CreateProductTagsResponse createProductTagsResponse, UnmarshallerContext context) {
		
		createProductTagsResponse.setRequestId(context.stringValue("CreateProductTagsResponse.RequestId"));
		createProductTagsResponse.setSuccess(context.booleanValue("CreateProductTagsResponse.Success"));
		createProductTagsResponse.setErrorMessage(context.stringValue("CreateProductTagsResponse.ErrorMessage"));
		createProductTagsResponse.setCode(context.stringValue("CreateProductTagsResponse.Code"));

		List<ProductTag> invalidProductTags = new ArrayList<ProductTag>();
		for (int i = 0; i < context.lengthValue("CreateProductTagsResponse.InvalidProductTags.Length"); i++) {
			ProductTag productTag = new ProductTag();
			productTag.setTagKey(context.stringValue("CreateProductTagsResponse.InvalidProductTags["+ i +"].TagKey"));
			productTag.setTagValue(context.stringValue("CreateProductTagsResponse.InvalidProductTags["+ i +"].TagValue"));

			invalidProductTags.add(productTag);
		}
		createProductTagsResponse.setInvalidProductTags(invalidProductTags);
	 
	 	return createProductTagsResponse;
	}
}