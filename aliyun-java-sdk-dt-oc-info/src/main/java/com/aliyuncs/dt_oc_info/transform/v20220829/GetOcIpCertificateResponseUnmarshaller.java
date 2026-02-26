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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpCertificateResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpCertificateResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIpCertificateResponseUnmarshaller {

	public static GetOcIpCertificateResponse unmarshall(GetOcIpCertificateResponse getOcIpCertificateResponse, UnmarshallerContext _ctx) {
		
		getOcIpCertificateResponse.setRequestId(_ctx.stringValue("GetOcIpCertificateResponse.RequestId"));
		getOcIpCertificateResponse.setCode(_ctx.stringValue("GetOcIpCertificateResponse.Code"));
		getOcIpCertificateResponse.setSuccess(_ctx.booleanValue("GetOcIpCertificateResponse.Success"));
		getOcIpCertificateResponse.setMessage(_ctx.stringValue("GetOcIpCertificateResponse.Message"));
		getOcIpCertificateResponse.setTotalNum(_ctx.integerValue("GetOcIpCertificateResponse.TotalNum"));
		getOcIpCertificateResponse.setPageIndex(_ctx.integerValue("GetOcIpCertificateResponse.PageIndex"));
		getOcIpCertificateResponse.setPageNum(_ctx.integerValue("GetOcIpCertificateResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIpCertificateResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].EntName"));
			dataItem.setCertType(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].CertType"));
			dataItem.setCertNum(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].CertNum"));
			dataItem.setValidStartDate(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].ValidStartDate"));
			dataItem.setValidEndDate(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].ValidEndDate"));
			dataItem.setAuthorizeDate(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].AuthorizeDate"));
			dataItem.setAuthorizeDepartment(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].AuthorizeDepartment"));
			dataItem.setPubDate(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].PubDate"));
			dataItem.setProvince(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].Province"));
			dataItem.setCertScope(_ctx.stringValue("GetOcIpCertificateResponse.Data["+ i +"].CertScope"));

			data.add(dataItem);
		}
		getOcIpCertificateResponse.setData(data);
	 
	 	return getOcIpCertificateResponse;
	}
}