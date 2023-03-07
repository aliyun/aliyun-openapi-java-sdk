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

import com.aliyuncs.vpc.model.v20160428.DescribeEcGrantRelationResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeEcGrantRelationResponse.EcGrantRelationModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEcGrantRelationResponseUnmarshaller {

	public static DescribeEcGrantRelationResponse unmarshall(DescribeEcGrantRelationResponse describeEcGrantRelationResponse, UnmarshallerContext _ctx) {
		
		describeEcGrantRelationResponse.setRequestId(_ctx.stringValue("DescribeEcGrantRelationResponse.RequestId"));
		describeEcGrantRelationResponse.setTotalCount(_ctx.integerValue("DescribeEcGrantRelationResponse.TotalCount"));
		describeEcGrantRelationResponse.setCount(_ctx.integerValue("DescribeEcGrantRelationResponse.Count"));
		describeEcGrantRelationResponse.setPage(_ctx.integerValue("DescribeEcGrantRelationResponse.Page"));
		describeEcGrantRelationResponse.setPageSize(_ctx.integerValue("DescribeEcGrantRelationResponse.PageSize"));

		List<EcGrantRelationModel> ecGrantRelations = new ArrayList<EcGrantRelationModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEcGrantRelationResponse.EcGrantRelations.Length"); i++) {
			EcGrantRelationModel ecGrantRelationModel = new EcGrantRelationModel();
			ecGrantRelationModel.setVbrOwnerUid(_ctx.longValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].VbrOwnerUid"));
			ecGrantRelationModel.setVbrInstanceId(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].VbrInstanceId"));
			ecGrantRelationModel.setInstanceId(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].InstanceId"));
			ecGrantRelationModel.setAliUid(_ctx.longValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].AliUid"));
			ecGrantRelationModel.setRegionNo(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].RegionNo"));
			ecGrantRelationModel.setStatus(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].Status"));
			ecGrantRelationModel.setInstanceName(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].InstanceName"));
			ecGrantRelationModel.setInstanceRouterId(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].InstanceRouterId"));
			ecGrantRelationModel.setVbrRegionNo(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].VbrRegionNo"));
			ecGrantRelationModel.setGmtCreate(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].GmtCreate"));
			ecGrantRelationModel.setGrantType(_ctx.stringValue("DescribeEcGrantRelationResponse.EcGrantRelations["+ i +"].GrantType"));

			ecGrantRelations.add(ecGrantRelationModel);
		}
		describeEcGrantRelationResponse.setEcGrantRelations(ecGrantRelations);
	 
	 	return describeEcGrantRelationResponse;
	}
}