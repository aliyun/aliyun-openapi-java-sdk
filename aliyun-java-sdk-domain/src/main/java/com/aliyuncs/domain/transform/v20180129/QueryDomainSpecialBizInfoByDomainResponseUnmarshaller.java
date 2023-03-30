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

import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizInfoByDomainResponse;
import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizInfoByDomainResponse.Module;
import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact;
import com.aliyuncs.domain.model.v20180129.QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainSpecialBizInfoByDomainResponseUnmarshaller {

	public static QueryDomainSpecialBizInfoByDomainResponse unmarshall(QueryDomainSpecialBizInfoByDomainResponse queryDomainSpecialBizInfoByDomainResponse, UnmarshallerContext _ctx) {
		
		queryDomainSpecialBizInfoByDomainResponse.setRequestId(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.RequestId"));
		queryDomainSpecialBizInfoByDomainResponse.setHttpStatusCode(_ctx.integerValue("QueryDomainSpecialBizInfoByDomainResponse.HttpStatusCode"));
		queryDomainSpecialBizInfoByDomainResponse.setDynamicCode(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.DynamicCode"));
		queryDomainSpecialBizInfoByDomainResponse.setDynamicMessage(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.DynamicMessage"));
		queryDomainSpecialBizInfoByDomainResponse.setSynchro(_ctx.booleanValue("QueryDomainSpecialBizInfoByDomainResponse.Synchro"));
		queryDomainSpecialBizInfoByDomainResponse.setErrorMsg(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.ErrorMsg"));
		queryDomainSpecialBizInfoByDomainResponse.setErrorCode(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.ErrorCode"));
		queryDomainSpecialBizInfoByDomainResponse.setSuccess(_ctx.booleanValue("QueryDomainSpecialBizInfoByDomainResponse.Success"));
		queryDomainSpecialBizInfoByDomainResponse.setAllowRetry(_ctx.booleanValue("QueryDomainSpecialBizInfoByDomainResponse.AllowRetry"));
		queryDomainSpecialBizInfoByDomainResponse.setAppName(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainSpecialBizInfoByDomainResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.ErrorArgs["+ i +"]"));
		}
		queryDomainSpecialBizInfoByDomainResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setId(_ctx.longValue("QueryDomainSpecialBizInfoByDomainResponse.Module.Id"));
		module.setGmtCreate(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.GmtCreate"));
		module.setGmtModified(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.GmtModified"));
		module.setBizName(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.BizName"));
		module.setBizNo(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.BizNo"));
		module.setDomainName(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainName"));
		module.setSaleId(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.SaleId"));
		module.setUserId(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.UserId"));
		module.setProductId(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.ProductId"));
		module.setBizType(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.BizType"));
		module.setBizStatus(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.BizStatus"));
		module.setStatus(_ctx.integerValue("QueryDomainSpecialBizInfoByDomainResponse.Module.Status"));
		module.setStatusDesc(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.StatusDesc"));
		module.setAuditMsg(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.AuditMsg"));
		module.setOrderId(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.OrderId"));
		module.setUpdateTime(_ctx.longValue("QueryDomainSpecialBizInfoByDomainResponse.Module.UpdateTime"));
		module.setCreateTime(_ctx.longValue("QueryDomainSpecialBizInfoByDomainResponse.Module.CreateTime"));

		DomainSpecialBizContact domainSpecialBizContact = new DomainSpecialBizContact();
		domainSpecialBizContact.setBizId(_ctx.longValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.BizId"));
		domainSpecialBizContact.setRegType(_ctx.integerValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.RegType"));
		domainSpecialBizContact.setCCompany(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.CCompany"));
		domainSpecialBizContact.setECompany(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.ECompany"));
		domainSpecialBizContact.setCName(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.CName"));
		domainSpecialBizContact.setEName(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.EName"));
		domainSpecialBizContact.setCCountry(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.CCountry"));
		domainSpecialBizContact.setCProvince(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.CProvince"));
		domainSpecialBizContact.setEProvince(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.EProvince"));
		domainSpecialBizContact.setCCity(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.CCity"));
		domainSpecialBizContact.setECity(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.ECity"));
		domainSpecialBizContact.setCVenu(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.CVenu"));
		domainSpecialBizContact.setEVenu(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.EVenu"));
		domainSpecialBizContact.setPostalcode(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.Postalcode"));
		domainSpecialBizContact.setEmail(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.Email"));
		domainSpecialBizContact.setTelArea(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.TelArea"));
		domainSpecialBizContact.setTelMain(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.TelMain"));
		domainSpecialBizContact.setTelExt(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.TelExt"));
		domainSpecialBizContact.setFaxArea(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.FaxArea"));
		domainSpecialBizContact.setFaxMain(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.FaxMain"));
		domainSpecialBizContact.setFaxExt(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.FaxExt"));
		domainSpecialBizContact.setMobile(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.Mobile"));
		domainSpecialBizContact.setExtend(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.Extend"));
		domainSpecialBizContact.setVspContactId(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.VspContactId"));
		domainSpecialBizContact.setRegistrantId(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizContact.RegistrantId"));
		module.setDomainSpecialBizContact(domainSpecialBizContact);

		List<DomainSpecialBizCredential> domainSpecialBizCredentials = new ArrayList<DomainSpecialBizCredential>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredentials.Length"); i++) {
			DomainSpecialBizCredential domainSpecialBizCredential = new DomainSpecialBizCredential();
			domainSpecialBizCredential.setDomainName(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredentials["+ i +"].DomainName"));
			domainSpecialBizCredential.setSaleId(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredentials["+ i +"].SaleId"));
			domainSpecialBizCredential.setBizId(_ctx.longValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredentials["+ i +"].BizId"));
			domainSpecialBizCredential.setCredentialNo(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredentials["+ i +"].CredentialNo"));
			domainSpecialBizCredential.setCredentialType(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredentials["+ i +"].CredentialType"));
			domainSpecialBizCredential.setCredentialUrl(_ctx.stringValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredentials["+ i +"].CredentialUrl"));
			domainSpecialBizCredential.setHolderCert(_ctx.integerValue("QueryDomainSpecialBizInfoByDomainResponse.Module.DomainSpecialBizCredentials["+ i +"].HolderCert"));

			domainSpecialBizCredentials.add(domainSpecialBizCredential);
		}
		module.setDomainSpecialBizCredentials(domainSpecialBizCredentials);
		queryDomainSpecialBizInfoByDomainResponse.setModule(module);
	 
	 	return queryDomainSpecialBizInfoByDomainResponse;
	}
}