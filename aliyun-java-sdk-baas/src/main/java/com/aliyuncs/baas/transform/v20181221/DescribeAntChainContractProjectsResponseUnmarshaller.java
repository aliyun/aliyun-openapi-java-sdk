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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectsResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectsResponse.Result.ContractProjectsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectsResponse.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainContractProjectsResponseUnmarshaller {

	public static DescribeAntChainContractProjectsResponse unmarshall(DescribeAntChainContractProjectsResponse describeAntChainContractProjectsResponse, UnmarshallerContext _ctx) {
		
		describeAntChainContractProjectsResponse.setRequestId(_ctx.stringValue("DescribeAntChainContractProjectsResponse.RequestId"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainContractProjectsResponse.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainContractProjectsResponse.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainContractProjectsResponse.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<ContractProjectsItem> contractProjects = new ArrayList<ContractProjectsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainContractProjectsResponse.Result.ContractProjects.Length"); i++) {
			ContractProjectsItem contractProjectsItem = new ContractProjectsItem();
			contractProjectsItem.setProjectId(_ctx.stringValue("DescribeAntChainContractProjectsResponse.Result.ContractProjects["+ i +"].ProjectId"));
			contractProjectsItem.setConsortiumId(_ctx.stringValue("DescribeAntChainContractProjectsResponse.Result.ContractProjects["+ i +"].ConsortiumId"));
			contractProjectsItem.setCreateTime(_ctx.longValue("DescribeAntChainContractProjectsResponse.Result.ContractProjects["+ i +"].CreateTime"));
			contractProjectsItem.setUpdateTime(_ctx.longValue("DescribeAntChainContractProjectsResponse.Result.ContractProjects["+ i +"].UpdateTime"));
			contractProjectsItem.setProjectName(_ctx.stringValue("DescribeAntChainContractProjectsResponse.Result.ContractProjects["+ i +"].ProjectName"));
			contractProjectsItem.setProjectVersion(_ctx.stringValue("DescribeAntChainContractProjectsResponse.Result.ContractProjects["+ i +"].ProjectVersion"));
			contractProjectsItem.setProjectDescription(_ctx.stringValue("DescribeAntChainContractProjectsResponse.Result.ContractProjects["+ i +"].ProjectDescription"));

			contractProjects.add(contractProjectsItem);
		}
		result.setContractProjects(contractProjects);
		describeAntChainContractProjectsResponse.setResult(result);
	 
	 	return describeAntChainContractProjectsResponse;
	}
}