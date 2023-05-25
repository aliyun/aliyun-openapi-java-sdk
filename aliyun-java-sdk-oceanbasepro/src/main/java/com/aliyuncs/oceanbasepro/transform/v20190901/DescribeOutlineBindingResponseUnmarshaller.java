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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOutlineBindingResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOutlineBindingResponse.OutlineBinding;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOutlineBindingResponseUnmarshaller {

	public static DescribeOutlineBindingResponse unmarshall(DescribeOutlineBindingResponse describeOutlineBindingResponse, UnmarshallerContext _ctx) {
		
		describeOutlineBindingResponse.setRequestId(_ctx.stringValue("DescribeOutlineBindingResponse.RequestId"));

		OutlineBinding outlineBinding = new OutlineBinding();
		outlineBinding.setBindPlan(_ctx.stringValue("DescribeOutlineBindingResponse.OutlineBinding.BindPlan"));
		outlineBinding.setOutlineId(_ctx.longValue("DescribeOutlineBindingResponse.OutlineBinding.OutlineId"));
		outlineBinding.setBindIndex(_ctx.stringValue("DescribeOutlineBindingResponse.OutlineBinding.BindIndex"));
		outlineBinding.setMaxConcurrent(_ctx.integerValue("DescribeOutlineBindingResponse.OutlineBinding.MaxConcurrent"));
		outlineBinding.setTableName(_ctx.stringValue("DescribeOutlineBindingResponse.OutlineBinding.TableName"));
		describeOutlineBindingResponse.setOutlineBinding(outlineBinding);
	 
	 	return describeOutlineBindingResponse;
	}
}