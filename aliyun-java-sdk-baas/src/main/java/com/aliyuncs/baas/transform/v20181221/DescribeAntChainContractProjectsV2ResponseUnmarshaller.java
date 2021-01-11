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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectsV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectsV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectsV2Response.Result.ContractProjectsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectsV2Response.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainContractProjectsV2ResponseUnmarshaller {

	public static DescribeAntChainContractProjectsV2Response unmarshall(DescribeAntChainContractProjectsV2Response describeAntChainContractProjectsV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainContractProjectsV2Response.setRequestId(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.RequestId"));
		describeAntChainContractProjectsV2Response.setResultCode(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.ResultCode"));
		describeAntChainContractProjectsV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.ResultMessage"));
		describeAntChainContractProjectsV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainContractProjectsV2Response.Success"));
		describeAntChainContractProjectsV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.HttpStatusCode"));
		describeAntChainContractProjectsV2Response.setCode(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.Code"));
		describeAntChainContractProjectsV2Response.setMessage(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.Message"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainContractProjectsV2Response.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainContractProjectsV2Response.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainContractProjectsV2Response.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<ContractProjectsItem> contractProjects = new ArrayList<ContractProjectsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainContractProjectsV2Response.Result.ContractProjects.Length"); i++) {
			ContractProjectsItem contractProjectsItem = new ContractProjectsItem();
			contractProjectsItem.setProjectId(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.Result.ContractProjects["+ i +"].ProjectId"));
			contractProjectsItem.setConsortiumId(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.Result.ContractProjects["+ i +"].ConsortiumId"));
			contractProjectsItem.setCreateTime(_ctx.longValue("DescribeAntChainContractProjectsV2Response.Result.ContractProjects["+ i +"].CreateTime"));
			contractProjectsItem.setUpdateTime(_ctx.longValue("DescribeAntChainContractProjectsV2Response.Result.ContractProjects["+ i +"].UpdateTime"));
			contractProjectsItem.setProjectName(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.Result.ContractProjects["+ i +"].ProjectName"));
			contractProjectsItem.setProjectVersion(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.Result.ContractProjects["+ i +"].ProjectVersion"));
			contractProjectsItem.setProjectDescription(_ctx.stringValue("DescribeAntChainContractProjectsV2Response.Result.ContractProjects["+ i +"].ProjectDescription"));

			contractProjects.add(contractProjectsItem);
		}
		result.setContractProjects(contractProjects);
		describeAntChainContractProjectsV2Response.setResult(result);
	 
	 	return describeAntChainContractProjectsV2Response;
	}
}