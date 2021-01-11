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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainCertificateApplicationsV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainCertificateApplicationsV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainCertificateApplicationsV2Response.Result.CertificateApplicationsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainCertificateApplicationsV2Response.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainCertificateApplicationsV2ResponseUnmarshaller {

	public static DescribeAntChainCertificateApplicationsV2Response unmarshall(DescribeAntChainCertificateApplicationsV2Response describeAntChainCertificateApplicationsV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainCertificateApplicationsV2Response.setRequestId(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.RequestId"));
		describeAntChainCertificateApplicationsV2Response.setResultCode(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.ResultCode"));
		describeAntChainCertificateApplicationsV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.ResultMessage"));
		describeAntChainCertificateApplicationsV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainCertificateApplicationsV2Response.Success"));
		describeAntChainCertificateApplicationsV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.HttpStatusCode"));
		describeAntChainCertificateApplicationsV2Response.setCode(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.Code"));
		describeAntChainCertificateApplicationsV2Response.setMessage(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.Message"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainCertificateApplicationsV2Response.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainCertificateApplicationsV2Response.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainCertificateApplicationsV2Response.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<CertificateApplicationsItem> certificateApplications = new ArrayList<CertificateApplicationsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainCertificateApplicationsV2Response.Result.CertificateApplications.Length"); i++) {
			CertificateApplicationsItem certificateApplicationsItem = new CertificateApplicationsItem();
			certificateApplicationsItem.setAntChainId(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.Result.CertificateApplications["+ i +"].AntChainId"));
			certificateApplicationsItem.setUsername(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.Result.CertificateApplications["+ i +"].Username"));
			certificateApplicationsItem.setCreatetime(_ctx.longValue("DescribeAntChainCertificateApplicationsV2Response.Result.CertificateApplications["+ i +"].Createtime"));
			certificateApplicationsItem.setUpdatetime(_ctx.longValue("DescribeAntChainCertificateApplicationsV2Response.Result.CertificateApplications["+ i +"].Updatetime"));
			certificateApplicationsItem.setBid(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.Result.CertificateApplications["+ i +"].Bid"));
			certificateApplicationsItem.setStatus(_ctx.stringValue("DescribeAntChainCertificateApplicationsV2Response.Result.CertificateApplications["+ i +"].Status"));

			certificateApplications.add(certificateApplicationsItem);
		}
		result.setCertificateApplications(certificateApplications);
		describeAntChainCertificateApplicationsV2Response.setResult(result);
	 
	 	return describeAntChainCertificateApplicationsV2Response;
	}
}