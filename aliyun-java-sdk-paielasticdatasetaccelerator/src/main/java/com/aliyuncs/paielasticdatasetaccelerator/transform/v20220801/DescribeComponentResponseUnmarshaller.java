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

package com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801;

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeComponentResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeComponentResponse.Template;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeComponentResponseUnmarshaller {

	public static DescribeComponentResponse unmarshall(DescribeComponentResponse describeComponentResponse, UnmarshallerContext _ctx) {
		
		describeComponentResponse.setRequestId(_ctx.stringValue("DescribeComponentResponse.RequestId"));
		describeComponentResponse.setUserId(_ctx.stringValue("DescribeComponentResponse.UserId"));
		describeComponentResponse.setOwnerId(_ctx.stringValue("DescribeComponentResponse.OwnerId"));
		describeComponentResponse.setGmtCreateTime(_ctx.stringValue("DescribeComponentResponse.GmtCreateTime"));
		describeComponentResponse.setGmtModifiedTime(_ctx.stringValue("DescribeComponentResponse.GmtModifiedTime"));
		describeComponentResponse.setUuid(_ctx.stringValue("DescribeComponentResponse.Uuid"));
		describeComponentResponse.setName(_ctx.stringValue("DescribeComponentResponse.Name"));
		describeComponentResponse.setVersion(_ctx.stringValue("DescribeComponentResponse.Version"));
		describeComponentResponse.setRenderedContent(_ctx.stringValue("DescribeComponentResponse.RenderedContent"));

		Template template = new Template();
		template.setType(_ctx.stringValue("DescribeComponentResponse.Template.Type"));
		template.setUri(_ctx.stringValue("DescribeComponentResponse.Template.Uri"));
		describeComponentResponse.setTemplate(template);
	 
	 	return describeComponentResponse;
	}
}