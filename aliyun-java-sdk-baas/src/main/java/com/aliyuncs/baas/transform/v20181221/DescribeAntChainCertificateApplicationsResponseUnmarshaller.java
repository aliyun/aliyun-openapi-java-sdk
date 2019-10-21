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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainCertificateApplicationsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainCertificateApplicationsResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainCertificateApplicationsResponse.Result.CertificateApplicationsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainCertificateApplicationsResponse.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainCertificateApplicationsResponseUnmarshaller {

	public static DescribeAntChainCertificateApplicationsResponse unmarshall(DescribeAntChainCertificateApplicationsResponse describeAntChainCertificateApplicationsResponse, UnmarshallerContext _ctx) {
		
		describeAntChainCertificateApplicationsResponse.setRequestId(_ctx.stringValue("DescribeAntChainCertificateApplicationsResponse.RequestId"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainCertificateApplicationsResponse.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainCertificateApplicationsResponse.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainCertificateApplicationsResponse.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<CertificateApplicationsItem> certificateApplications = new ArrayList<CertificateApplicationsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainCertificateApplicationsResponse.Result.CertificateApplications.Length"); i++) {
			CertificateApplicationsItem certificateApplicationsItem = new CertificateApplicationsItem();
			certificateApplicationsItem.setAntChainId(_ctx.stringValue("DescribeAntChainCertificateApplicationsResponse.Result.CertificateApplications["+ i +"].AntChainId"));
			certificateApplicationsItem.setUsername(_ctx.stringValue("DescribeAntChainCertificateApplicationsResponse.Result.CertificateApplications["+ i +"].Username"));
			certificateApplicationsItem.setCreatetime(_ctx.longValue("DescribeAntChainCertificateApplicationsResponse.Result.CertificateApplications["+ i +"].Createtime"));
			certificateApplicationsItem.setUpdatetime(_ctx.longValue("DescribeAntChainCertificateApplicationsResponse.Result.CertificateApplications["+ i +"].Updatetime"));
			certificateApplicationsItem.setBid(_ctx.stringValue("DescribeAntChainCertificateApplicationsResponse.Result.CertificateApplications["+ i +"].Bid"));
			certificateApplicationsItem.setStatus(_ctx.stringValue("DescribeAntChainCertificateApplicationsResponse.Result.CertificateApplications["+ i +"].Status"));

			certificateApplications.add(certificateApplicationsItem);
		}
		result.setCertificateApplications(certificateApplications);
		describeAntChainCertificateApplicationsResponse.setResult(result);
	 
	 	return describeAntChainCertificateApplicationsResponse;
	}
}