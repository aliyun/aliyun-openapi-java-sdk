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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeGroupedTagsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeGroupedTagsResponse.GroupedFiled;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupedTagsResponseUnmarshaller {

	public static DescribeGroupedTagsResponse unmarshall(DescribeGroupedTagsResponse describeGroupedTagsResponse, UnmarshallerContext _ctx) {
		
		describeGroupedTagsResponse.setRequestId(_ctx.stringValue("DescribeGroupedTagsResponse.RequestId"));
		describeGroupedTagsResponse.setSuccess(_ctx.booleanValue("DescribeGroupedTagsResponse.Success"));
		describeGroupedTagsResponse.setCount(_ctx.integerValue("DescribeGroupedTagsResponse.Count"));
		describeGroupedTagsResponse.setHttpStatusCode(_ctx.integerValue("DescribeGroupedTagsResponse.HttpStatusCode"));

		List<GroupedFiled> groupedFileds = new ArrayList<GroupedFiled>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupedTagsResponse.GroupedFileds.Length"); i++) {
			GroupedFiled groupedFiled = new GroupedFiled();
			groupedFiled.setName(_ctx.stringValue("DescribeGroupedTagsResponse.GroupedFileds["+ i +"].Name"));
			groupedFiled.setTagId(_ctx.integerValue("DescribeGroupedTagsResponse.GroupedFileds["+ i +"].TagId"));
			groupedFiled.setCount(_ctx.stringValue("DescribeGroupedTagsResponse.GroupedFileds["+ i +"].Count"));

			groupedFileds.add(groupedFiled);
		}
		describeGroupedTagsResponse.setGroupedFileds(groupedFileds);
	 
	 	return describeGroupedTagsResponse;
	}
}