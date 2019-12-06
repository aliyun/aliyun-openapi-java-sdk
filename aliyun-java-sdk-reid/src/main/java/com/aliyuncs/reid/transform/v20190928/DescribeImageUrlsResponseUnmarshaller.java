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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.DescribeImageUrlsResponse;
import com.aliyuncs.reid.model.v20190928.DescribeImageUrlsResponse.ImageUrl;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageUrlsResponseUnmarshaller {

	public static DescribeImageUrlsResponse unmarshall(DescribeImageUrlsResponse describeImageUrlsResponse, UnmarshallerContext _ctx) {
		
		describeImageUrlsResponse.setRequestId(_ctx.stringValue("DescribeImageUrlsResponse.RequestId"));
		describeImageUrlsResponse.setErrorCode(_ctx.stringValue("DescribeImageUrlsResponse.ErrorCode"));
		describeImageUrlsResponse.setErrorMessage(_ctx.stringValue("DescribeImageUrlsResponse.ErrorMessage"));
		describeImageUrlsResponse.setMessage(_ctx.stringValue("DescribeImageUrlsResponse.Message"));
		describeImageUrlsResponse.setCode(_ctx.stringValue("DescribeImageUrlsResponse.Code"));
		describeImageUrlsResponse.setDynamicCode(_ctx.stringValue("DescribeImageUrlsResponse.DynamicCode"));
		describeImageUrlsResponse.setSuccess(_ctx.booleanValue("DescribeImageUrlsResponse.Success"));
		describeImageUrlsResponse.setDynamicMessage(_ctx.stringValue("DescribeImageUrlsResponse.DynamicMessage"));

		List<ImageUrl> urls = new ArrayList<ImageUrl>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageUrlsResponse.Urls.Length"); i++) {
			ImageUrl imageUrl = new ImageUrl();
			imageUrl.setObjectKey(_ctx.stringValue("DescribeImageUrlsResponse.Urls["+ i +"].ObjectKey"));
			imageUrl.setUrl(_ctx.stringValue("DescribeImageUrlsResponse.Urls["+ i +"].Url"));

			urls.add(imageUrl);
		}
		describeImageUrlsResponse.setUrls(urls);
	 
	 	return describeImageUrlsResponse;
	}
}