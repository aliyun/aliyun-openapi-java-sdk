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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeVpnCrossAccountAuthorizationsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVpnCrossAccountAuthorizationsResponse.CrossAccountAuthorization;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpnCrossAccountAuthorizationsResponseUnmarshaller {

	public static DescribeVpnCrossAccountAuthorizationsResponse unmarshall(DescribeVpnCrossAccountAuthorizationsResponse describeVpnCrossAccountAuthorizationsResponse, UnmarshallerContext _ctx) {
		
		describeVpnCrossAccountAuthorizationsResponse.setRequestId(_ctx.stringValue("DescribeVpnCrossAccountAuthorizationsResponse.RequestId"));
		describeVpnCrossAccountAuthorizationsResponse.setTotalCount(_ctx.integerValue("DescribeVpnCrossAccountAuthorizationsResponse.TotalCount"));
		describeVpnCrossAccountAuthorizationsResponse.setPageNumber(_ctx.integerValue("DescribeVpnCrossAccountAuthorizationsResponse.PageNumber"));
		describeVpnCrossAccountAuthorizationsResponse.setPageSize(_ctx.integerValue("DescribeVpnCrossAccountAuthorizationsResponse.PageSize"));

		List<CrossAccountAuthorization> crossAccountAuthorizations = new ArrayList<CrossAccountAuthorization>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpnCrossAccountAuthorizationsResponse.CrossAccountAuthorizations.Length"); i++) {
			CrossAccountAuthorization crossAccountAuthorization = new CrossAccountAuthorization();
			crossAccountAuthorization.setVpnConnectionId(_ctx.stringValue("DescribeVpnCrossAccountAuthorizationsResponse.CrossAccountAuthorizations["+ i +"].VpnConnectionId"));
			crossAccountAuthorization.setBindUid(_ctx.longValue("DescribeVpnCrossAccountAuthorizationsResponse.CrossAccountAuthorizations["+ i +"].BindUid"));
			crossAccountAuthorization.setBindProduct(_ctx.stringValue("DescribeVpnCrossAccountAuthorizationsResponse.CrossAccountAuthorizations["+ i +"].BindProduct"));
			crossAccountAuthorization.setBindInstance(_ctx.stringValue("DescribeVpnCrossAccountAuthorizationsResponse.CrossAccountAuthorizations["+ i +"].BindInstance"));
			crossAccountAuthorization.setAliUid(_ctx.longValue("DescribeVpnCrossAccountAuthorizationsResponse.CrossAccountAuthorizations["+ i +"].AliUid"));
			crossAccountAuthorization.setCreationTime(_ctx.longValue("DescribeVpnCrossAccountAuthorizationsResponse.CrossAccountAuthorizations["+ i +"].CreationTime"));

			crossAccountAuthorizations.add(crossAccountAuthorization);
		}
		describeVpnCrossAccountAuthorizationsResponse.setCrossAccountAuthorizations(crossAccountAuthorizations);
	 
	 	return describeVpnCrossAccountAuthorizationsResponse;
	}
}