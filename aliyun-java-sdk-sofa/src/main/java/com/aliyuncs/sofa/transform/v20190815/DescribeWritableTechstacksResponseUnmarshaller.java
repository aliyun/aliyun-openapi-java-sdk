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

import com.aliyuncs.sofa.model.v20190815.DescribeWritableTechstacksResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeWritableTechstacksResponse.TechstackItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWritableTechstacksResponseUnmarshaller {

	public static DescribeWritableTechstacksResponse unmarshall(DescribeWritableTechstacksResponse describeWritableTechstacksResponse, UnmarshallerContext _ctx) {
		
		describeWritableTechstacksResponse.setRequestId(_ctx.stringValue("DescribeWritableTechstacksResponse.RequestId"));
		describeWritableTechstacksResponse.setResultCode(_ctx.stringValue("DescribeWritableTechstacksResponse.ResultCode"));
		describeWritableTechstacksResponse.setResultMessage(_ctx.stringValue("DescribeWritableTechstacksResponse.ResultMessage"));

		List<TechstackItem> techstack = new ArrayList<TechstackItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWritableTechstacksResponse.Techstack.Length"); i++) {
			TechstackItem techstackItem = new TechstackItem();
			techstackItem.setDescription(_ctx.stringValue("DescribeWritableTechstacksResponse.Techstack["+ i +"].Description"));
			techstackItem.setExtraInfo(_ctx.stringValue("DescribeWritableTechstacksResponse.Techstack["+ i +"].ExtraInfo"));
			techstackItem.setId(_ctx.stringValue("DescribeWritableTechstacksResponse.Techstack["+ i +"].Id"));
			techstackItem.setIdentity(_ctx.stringValue("DescribeWritableTechstacksResponse.Techstack["+ i +"].Identity"));
			techstackItem.setName(_ctx.stringValue("DescribeWritableTechstacksResponse.Techstack["+ i +"].Name"));
			techstackItem.setScope(_ctx.stringValue("DescribeWritableTechstacksResponse.Techstack["+ i +"].Scope"));
			techstackItem.setStatus(_ctx.stringValue("DescribeWritableTechstacksResponse.Techstack["+ i +"].Status"));

			techstack.add(techstackItem);
		}
		describeWritableTechstacksResponse.setTechstack(techstack);
	 
	 	return describeWritableTechstacksResponse;
	}
}