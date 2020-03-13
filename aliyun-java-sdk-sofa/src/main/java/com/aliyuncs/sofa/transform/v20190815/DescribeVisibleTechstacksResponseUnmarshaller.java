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

import com.aliyuncs.sofa.model.v20190815.DescribeVisibleTechstacksResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeVisibleTechstacksResponse.TechstackItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVisibleTechstacksResponseUnmarshaller {

	public static DescribeVisibleTechstacksResponse unmarshall(DescribeVisibleTechstacksResponse describeVisibleTechstacksResponse, UnmarshallerContext _ctx) {
		
		describeVisibleTechstacksResponse.setRequestId(_ctx.stringValue("DescribeVisibleTechstacksResponse.RequestId"));
		describeVisibleTechstacksResponse.setResultCode(_ctx.stringValue("DescribeVisibleTechstacksResponse.ResultCode"));
		describeVisibleTechstacksResponse.setResultMessage(_ctx.stringValue("DescribeVisibleTechstacksResponse.ResultMessage"));

		List<TechstackItem> techstack = new ArrayList<TechstackItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVisibleTechstacksResponse.Techstack.Length"); i++) {
			TechstackItem techstackItem = new TechstackItem();
			techstackItem.setDescription(_ctx.stringValue("DescribeVisibleTechstacksResponse.Techstack["+ i +"].Description"));
			techstackItem.setExtraInfo(_ctx.stringValue("DescribeVisibleTechstacksResponse.Techstack["+ i +"].ExtraInfo"));
			techstackItem.setId(_ctx.stringValue("DescribeVisibleTechstacksResponse.Techstack["+ i +"].Id"));
			techstackItem.setIdentity(_ctx.stringValue("DescribeVisibleTechstacksResponse.Techstack["+ i +"].Identity"));
			techstackItem.setName(_ctx.stringValue("DescribeVisibleTechstacksResponse.Techstack["+ i +"].Name"));
			techstackItem.setScope(_ctx.stringValue("DescribeVisibleTechstacksResponse.Techstack["+ i +"].Scope"));
			techstackItem.setStatus(_ctx.stringValue("DescribeVisibleTechstacksResponse.Techstack["+ i +"].Status"));

			techstack.add(techstackItem);
		}
		describeVisibleTechstacksResponse.setTechstack(techstack);
	 
	 	return describeVisibleTechstacksResponse;
	}
}