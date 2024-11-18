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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeActivationCodesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeActivationCodesResponse.ActivationCodes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActivationCodesResponseUnmarshaller {

	public static DescribeActivationCodesResponse unmarshall(DescribeActivationCodesResponse describeActivationCodesResponse, UnmarshallerContext _ctx) {
		
		describeActivationCodesResponse.setRequestId(_ctx.stringValue("DescribeActivationCodesResponse.RequestId"));
		describeActivationCodesResponse.setPageNumber(_ctx.integerValue("DescribeActivationCodesResponse.PageNumber"));
		describeActivationCodesResponse.setPageRecordCount(_ctx.integerValue("DescribeActivationCodesResponse.PageRecordCount"));
		describeActivationCodesResponse.setTotalRecordCount(_ctx.integerValue("DescribeActivationCodesResponse.TotalRecordCount"));

		List<ActivationCodes> items = new ArrayList<ActivationCodes>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActivationCodesResponse.Items.Length"); i++) {
			ActivationCodes activationCodes = new ActivationCodes();
			activationCodes.setActivateAt(_ctx.stringValue("DescribeActivationCodesResponse.Items["+ i +"].ActivateAt"));
			activationCodes.setDescription(_ctx.stringValue("DescribeActivationCodesResponse.Items["+ i +"].Description"));
			activationCodes.setExpireAt(_ctx.stringValue("DescribeActivationCodesResponse.Items["+ i +"].ExpireAt"));
			activationCodes.setGmtCreated(_ctx.stringValue("DescribeActivationCodesResponse.Items["+ i +"].GmtCreated"));
			activationCodes.setGmtModified(_ctx.stringValue("DescribeActivationCodesResponse.Items["+ i +"].GmtModified"));
			activationCodes.setId(_ctx.integerValue("DescribeActivationCodesResponse.Items["+ i +"].Id"));
			activationCodes.setMacAddress(_ctx.stringValue("DescribeActivationCodesResponse.Items["+ i +"].MacAddress"));
			activationCodes.setName(_ctx.stringValue("DescribeActivationCodesResponse.Items["+ i +"].Name"));
			activationCodes.setSystemIdentifier(_ctx.stringValue("DescribeActivationCodesResponse.Items["+ i +"].SystemIdentifier"));

			items.add(activationCodes);
		}
		describeActivationCodesResponse.setItems(items);
	 
	 	return describeActivationCodesResponse;
	}
}