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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeWhitelistTemplateLinkedInstanceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeWhitelistTemplateLinkedInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhitelistTemplateLinkedInstanceResponseUnmarshaller {

	public static DescribeWhitelistTemplateLinkedInstanceResponse unmarshall(DescribeWhitelistTemplateLinkedInstanceResponse describeWhitelistTemplateLinkedInstanceResponse, UnmarshallerContext _ctx) {
		
		describeWhitelistTemplateLinkedInstanceResponse.setRequestId(_ctx.stringValue("DescribeWhitelistTemplateLinkedInstanceResponse.RequestId"));
		describeWhitelistTemplateLinkedInstanceResponse.setSuccess(_ctx.booleanValue("DescribeWhitelistTemplateLinkedInstanceResponse.Success"));
		describeWhitelistTemplateLinkedInstanceResponse.setCode(_ctx.stringValue("DescribeWhitelistTemplateLinkedInstanceResponse.Code"));
		describeWhitelistTemplateLinkedInstanceResponse.setMessage(_ctx.stringValue("DescribeWhitelistTemplateLinkedInstanceResponse.Message"));
		describeWhitelistTemplateLinkedInstanceResponse.setHttpStatusCode(_ctx.integerValue("DescribeWhitelistTemplateLinkedInstanceResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTemplateId(_ctx.integerValue("DescribeWhitelistTemplateLinkedInstanceResponse.Data.TemplateId"));

		List<String> insName = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWhitelistTemplateLinkedInstanceResponse.Data.InsName.Length"); i++) {
			insName.add(_ctx.stringValue("DescribeWhitelistTemplateLinkedInstanceResponse.Data.InsName["+ i +"]"));
		}
		data.setInsName(insName);
		describeWhitelistTemplateLinkedInstanceResponse.setData(data);
	 
	 	return describeWhitelistTemplateLinkedInstanceResponse;
	}
}