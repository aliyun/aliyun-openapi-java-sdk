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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse unmarshall(QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Message"));
		queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Success"));

		Data data = new Data();
		data.setApplyOwner(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.ApplyOwner"));
		data.setAppInstanceGroup(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.AppInstanceGroup"));
		data.setAppName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.AppName"));
		data.setAppServiceName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.AppServiceName"));
		data.setBranchName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.BranchName"));
		data.setCluster(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.Cluster"));
		data.setCodeUrl(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.CodeUrl"));
		data.setCommitId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.CommitId"));
		data.setCpuLimit(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.CpuLimit"));
		data.setCpuRequest(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.CpuRequest"));
		data.setEnvName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.EnvName"));
		data.setEnvType(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.EnvType"));
		data.setFirstCreate(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.FirstCreate"));
		data.setFromApp(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.FromApp"));
		data.setGmtCreate(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.Id"));
		data.setImage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.Image"));
		data.setMemoryLimit(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.MemoryLimit"));
		data.setMemoryRequest(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.MemoryRequest"));
		data.setMeta(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.Meta"));
		data.setName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.Name"));
		data.setNamespace(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.Namespace"));
		data.setPaasDetailUrl(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.PaasDetailUrl"));
		data.setProjectId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.ProjectId"));
		data.setReplicas(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.Replicas"));
		data.setServiceStatus(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.ServiceStatus"));
		data.setTenantName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.TenantName"));
		data.setUniqueId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.Data.UniqueId"));
		queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponse;
	}
}