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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizDetailResponse;
import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizDetailResponse.Module;
import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact;
import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredential;
import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainSpecialBizDetailResponseUnmarshaller {

	public static QueryDomainSpecialBizDetailResponse unmarshall(QueryDomainSpecialBizDetailResponse queryDomainSpecialBizDetailResponse, UnmarshallerContext _ctx) {
		
		queryDomainSpecialBizDetailResponse.setRequestId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.RequestId"));
		queryDomainSpecialBizDetailResponse.setHttpStatusCode(_ctx.integerValue("QueryDomainSpecialBizDetailResponse.HttpStatusCode"));
		queryDomainSpecialBizDetailResponse.setDynamicCode(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.DynamicCode"));
		queryDomainSpecialBizDetailResponse.setDynamicMessage(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.DynamicMessage"));
		queryDomainSpecialBizDetailResponse.setSynchro(_ctx.booleanValue("QueryDomainSpecialBizDetailResponse.Synchro"));
		queryDomainSpecialBizDetailResponse.setErrorMsg(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.ErrorMsg"));
		queryDomainSpecialBizDetailResponse.setErrorCode(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.ErrorCode"));
		queryDomainSpecialBizDetailResponse.setSuccess(_ctx.booleanValue("QueryDomainSpecialBizDetailResponse.Success"));
		queryDomainSpecialBizDetailResponse.setAllowRetry(_ctx.booleanValue("QueryDomainSpecialBizDetailResponse.AllowRetry"));
		queryDomainSpecialBizDetailResponse.setAppName(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainSpecialBizDetailResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.ErrorArgs["+ i +"]"));
		}
		queryDomainSpecialBizDetailResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setId(_ctx.longValue("QueryDomainSpecialBizDetailResponse.Module.Id"));
		module.setGmtCreate(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.GmtCreate"));
		module.setGmtModified(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.GmtModified"));
		module.setBizName(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.BizName"));
		module.setBizNo(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.BizNo"));
		module.setDomainName(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainName"));
		module.setSaleId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.SaleId"));
		module.setUserId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.UserId"));
		module.setProductId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.ProductId"));
		module.setBizType(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.BizType"));
		module.setBizStatus(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.BizStatus"));
		module.setStatus(_ctx.integerValue("QueryDomainSpecialBizDetailResponse.Module.Status"));
		module.setStatusDesc(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.StatusDesc"));
		module.setAuditMsg(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.AuditMsg"));
		module.setOrderId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.OrderId"));
		module.setUpdateTime(_ctx.longValue("QueryDomainSpecialBizDetailResponse.Module.UpdateTime"));
		module.setCreateTime(_ctx.longValue("QueryDomainSpecialBizDetailResponse.Module.CreateTime"));

		DomainSpecialBizContact domainSpecialBizContact = new DomainSpecialBizContact();
		domainSpecialBizContact.setBizId(_ctx.longValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.BizId"));
		domainSpecialBizContact.setRegType(_ctx.integerValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.RegType"));
		domainSpecialBizContact.setCCompany(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.CCompany"));
		domainSpecialBizContact.setECompany(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.ECompany"));
		domainSpecialBizContact.setCName(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.CName"));
		domainSpecialBizContact.setEName(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.EName"));
		domainSpecialBizContact.setCCountry(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.CCountry"));
		domainSpecialBizContact.setCProvince(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.CProvince"));
		domainSpecialBizContact.setEProvince(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.EProvince"));
		domainSpecialBizContact.setCCity(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.CCity"));
		domainSpecialBizContact.setECity(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.ECity"));
		domainSpecialBizContact.setCVenu(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.CVenu"));
		domainSpecialBizContact.setEVenu(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.EVenu"));
		domainSpecialBizContact.setPostalcode(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.Postalcode"));
		domainSpecialBizContact.setEmail(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.Email"));
		domainSpecialBizContact.setTelArea(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.TelArea"));
		domainSpecialBizContact.setTelMain(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.TelMain"));
		domainSpecialBizContact.setTelExt(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.TelExt"));
		domainSpecialBizContact.setFaxArea(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.FaxArea"));
		domainSpecialBizContact.setFaxMain(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.FaxMain"));
		domainSpecialBizContact.setFaxExt(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.FaxExt"));
		domainSpecialBizContact.setMobile(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.Mobile"));
		domainSpecialBizContact.setExtend(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.Extend"));
		domainSpecialBizContact.setVspContactId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.VspContactId"));
		domainSpecialBizContact.setRegistrantId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizContact.RegistrantId"));
		module.setDomainSpecialBizContact(domainSpecialBizContact);

		DomainSpecialOrderResult domainSpecialOrderResult = new DomainSpecialOrderResult();
		domainSpecialOrderResult.setSaleId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.SaleId"));
		domainSpecialOrderResult.setOrderId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.OrderId"));
		domainSpecialOrderResult.setSubOrderId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.SubOrderId"));
		domainSpecialOrderResult.setActionType(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.ActionType"));
		domainSpecialOrderResult.setOrderAmount(_ctx.doubleValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.OrderAmount"));
		domainSpecialOrderResult.setOrderCurrency(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.OrderCurrency"));
		domainSpecialOrderResult.setOrderTime(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.OrderTime"));
		domainSpecialOrderResult.setOrderYear(_ctx.integerValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.OrderYear"));
		domainSpecialOrderResult.setOrderStatus(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialOrderResult.OrderStatus"));
		module.setDomainSpecialOrderResult(domainSpecialOrderResult);

		List<DomainSpecialBizCredential> domainSpecialBizCredentials = new ArrayList<DomainSpecialBizCredential>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredentials.Length"); i++) {
			DomainSpecialBizCredential domainSpecialBizCredential = new DomainSpecialBizCredential();
			domainSpecialBizCredential.setDomainName(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredentials["+ i +"].DomainName"));
			domainSpecialBizCredential.setSaleId(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredentials["+ i +"].SaleId"));
			domainSpecialBizCredential.setBizId(_ctx.longValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredentials["+ i +"].BizId"));
			domainSpecialBizCredential.setCredentialNo(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredentials["+ i +"].CredentialNo"));
			domainSpecialBizCredential.setCredentialType(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredentials["+ i +"].CredentialType"));
			domainSpecialBizCredential.setCredentialUrl(_ctx.stringValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredentials["+ i +"].CredentialUrl"));
			domainSpecialBizCredential.setHolderCert(_ctx.integerValue("QueryDomainSpecialBizDetailResponse.Module.DomainSpecialBizCredentials["+ i +"].HolderCert"));

			domainSpecialBizCredentials.add(domainSpecialBizCredential);
		}
		module.setDomainSpecialBizCredentials(domainSpecialBizCredentials);
		queryDomainSpecialBizDetailResponse.setModule(module);
	 
	 	return queryDomainSpecialBizDetailResponse;
	}
}