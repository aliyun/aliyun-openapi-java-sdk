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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.DescribePageFaceVerifyDataResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribePageFaceVerifyDataResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePageFaceVerifyDataResponseUnmarshaller {

	public static DescribePageFaceVerifyDataResponse unmarshall(DescribePageFaceVerifyDataResponse describePageFaceVerifyDataResponse, UnmarshallerContext _ctx) {
		
		describePageFaceVerifyDataResponse.setRequestId(_ctx.stringValue("DescribePageFaceVerifyDataResponse.RequestId"));
		describePageFaceVerifyDataResponse.setSuccess(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Success"));
		describePageFaceVerifyDataResponse.setCode(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Code"));
		describePageFaceVerifyDataResponse.setMessage(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Message"));
		describePageFaceVerifyDataResponse.setTotalCount(_ctx.stringValue("DescribePageFaceVerifyDataResponse.TotalCount"));
		describePageFaceVerifyDataResponse.setPageSize(_ctx.stringValue("DescribePageFaceVerifyDataResponse.PageSize"));
		describePageFaceVerifyDataResponse.setTotalPage(_ctx.stringValue("DescribePageFaceVerifyDataResponse.TotalPage"));
		describePageFaceVerifyDataResponse.setCurrentPage(_ctx.stringValue("DescribePageFaceVerifyDataResponse.CurrentPage"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePageFaceVerifyDataResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDate(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Items["+ i +"].Date"));
			itemsItem.setTotalCount(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Items["+ i +"].TotalCount"));
			itemsItem.setSuccessCount(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Items["+ i +"].SuccessCount"));
			itemsItem.setSceneId(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Items["+ i +"].SceneId"));
			itemsItem.setSceneName(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Items["+ i +"].SceneName"));
			itemsItem.setProductCode(_ctx.stringValue("DescribePageFaceVerifyDataResponse.Items["+ i +"].ProductCode"));

			items.add(itemsItem);
		}
		describePageFaceVerifyDataResponse.setItems(items);
	 
	 	return describePageFaceVerifyDataResponse;
	}
}