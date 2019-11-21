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

import com.aliyuncs.sas.model.v20181203.DescribeVulWhitelistResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVulWhitelistResponse.VulWhitelist;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulWhitelistResponseUnmarshaller {

	public static DescribeVulWhitelistResponse unmarshall(DescribeVulWhitelistResponse describeVulWhitelistResponse, UnmarshallerContext _ctx) {
		
		describeVulWhitelistResponse.setRequestId(_ctx.stringValue("DescribeVulWhitelistResponse.RequestId"));
		describeVulWhitelistResponse.setPageSize(_ctx.integerValue("DescribeVulWhitelistResponse.PageSize"));
		describeVulWhitelistResponse.setCurrentPage(_ctx.integerValue("DescribeVulWhitelistResponse.CurrentPage"));
		describeVulWhitelistResponse.setTotalCount(_ctx.integerValue("DescribeVulWhitelistResponse.TotalCount"));

		List<VulWhitelist> vulWhitelists = new ArrayList<VulWhitelist>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulWhitelistResponse.VulWhitelists.Length"); i++) {
			VulWhitelist vulWhitelist = new VulWhitelist();
			vulWhitelist.setName(_ctx.stringValue("DescribeVulWhitelistResponse.VulWhitelists["+ i +"].Name"));
			vulWhitelist.setType(_ctx.stringValue("DescribeVulWhitelistResponse.VulWhitelists["+ i +"].Type"));
			vulWhitelist.setAliasName(_ctx.stringValue("DescribeVulWhitelistResponse.VulWhitelists["+ i +"].AliasName"));
			vulWhitelist.setReason(_ctx.stringValue("DescribeVulWhitelistResponse.VulWhitelists["+ i +"].Reason"));

			vulWhitelists.add(vulWhitelist);
		}
		describeVulWhitelistResponse.setVulWhitelists(vulWhitelists);
	 
	 	return describeVulWhitelistResponse;
	}
}