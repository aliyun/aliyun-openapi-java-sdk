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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.DataItem;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.DataItem.Certificate;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.DataItem.Ownership;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.DataItem.Resolution;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.DataItem.Resolution.DnsRecord1;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.DataItem.Verification;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.DataItem.Verification.DnsRecord;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.Next;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.Next.Certificate4;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.Next.Ownership5;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.Next.Resolution3;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.Next.Resolution3.DnsRecord7;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.Next.Verification2;
import com.aliyuncs.websitebuild.model.v20250429.ListAppInstanceDomainsResponse.Module.Next.Verification2.DnsRecord6;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInstanceDomainsResponseUnmarshaller {

	public static ListAppInstanceDomainsResponse unmarshall(ListAppInstanceDomainsResponse listAppInstanceDomainsResponse, UnmarshallerContext _ctx) {
		
		listAppInstanceDomainsResponse.setRequestId(_ctx.stringValue("ListAppInstanceDomainsResponse.RequestId"));
		listAppInstanceDomainsResponse.setDynamicCode(_ctx.stringValue("ListAppInstanceDomainsResponse.DynamicCode"));
		listAppInstanceDomainsResponse.setDynamicMessage(_ctx.stringValue("ListAppInstanceDomainsResponse.DynamicMessage"));
		listAppInstanceDomainsResponse.setSynchro(_ctx.booleanValue("ListAppInstanceDomainsResponse.Synchro"));
		listAppInstanceDomainsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppInstanceDomainsResponse.AccessDeniedDetail"));
		listAppInstanceDomainsResponse.setRootErrorMsg(_ctx.stringValue("ListAppInstanceDomainsResponse.RootErrorMsg"));
		listAppInstanceDomainsResponse.setRootErrorCode(_ctx.stringValue("ListAppInstanceDomainsResponse.RootErrorCode"));
		listAppInstanceDomainsResponse.setAllowRetry(_ctx.booleanValue("ListAppInstanceDomainsResponse.AllowRetry"));
		listAppInstanceDomainsResponse.setAppName(_ctx.stringValue("ListAppInstanceDomainsResponse.AppName"));
		listAppInstanceDomainsResponse.setMaxResults(_ctx.integerValue("ListAppInstanceDomainsResponse.MaxResults"));
		listAppInstanceDomainsResponse.setNextToken(_ctx.stringValue("ListAppInstanceDomainsResponse.NextToken"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstanceDomainsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppInstanceDomainsResponse.ErrorArgs["+ i +"]"));
		}
		listAppInstanceDomainsResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setTotalItemNum(_ctx.integerValue("ListAppInstanceDomainsResponse.Module.TotalItemNum"));
		module.setCurrentPageNum(_ctx.integerValue("ListAppInstanceDomainsResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("ListAppInstanceDomainsResponse.Module.PageSize"));
		module.setTotalPageNum(_ctx.integerValue("ListAppInstanceDomainsResponse.Module.TotalPageNum"));
		module.setPrePage(_ctx.booleanValue("ListAppInstanceDomainsResponse.Module.PrePage"));
		module.setNextPage(_ctx.booleanValue("ListAppInstanceDomainsResponse.Module.NextPage"));
		module.setResultLimit(_ctx.booleanValue("ListAppInstanceDomainsResponse.Module.ResultLimit"));

		Next next = new Next();
		next.setDomainName(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.DomainName"));
		next.setCreateTime(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.CreateTime"));
		next.setOverallStatus(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.OverallStatus"));

		Verification2 verification2 = new Verification2();
		verification2.setVerificationStatus(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Verification.VerificationStatus"));
		verification2.setErrorMsg(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Verification.ErrorMsg"));

		DnsRecord6 dnsRecord6 = new DnsRecord6();
		dnsRecord6.setRecordType(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Verification.DnsRecord.RecordType"));
		dnsRecord6.setHost(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Verification.DnsRecord.Host"));
		dnsRecord6.setValue(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Verification.DnsRecord.Value"));
		verification2.setDnsRecord6(dnsRecord6);
		next.setVerification2(verification2);

		Resolution3 resolution3 = new Resolution3();
		resolution3.setResolutionStatus(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Resolution.ResolutionStatus"));
		resolution3.setErrorMsg(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Resolution.ErrorMsg"));

		DnsRecord7 dnsRecord7 = new DnsRecord7();
		dnsRecord7.setRecordType(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Resolution.DnsRecord.RecordType"));
		dnsRecord7.setHost(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Resolution.DnsRecord.Host"));
		dnsRecord7.setValue(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Resolution.DnsRecord.Value"));
		resolution3.setDnsRecord7(dnsRecord7);
		next.setResolution3(resolution3);

		Certificate4 certificate4 = new Certificate4();
		certificate4.setCertificateStatus(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Certificate.CertificateStatus"));
		certificate4.setCertificateType(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Certificate.CertificateType"));
		certificate4.setCertificateName(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Certificate.CertificateName"));
		certificate4.setEndTime(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Certificate.EndTime"));
		next.setCertificate4(certificate4);

		Ownership5 ownership5 = new Ownership5();
		ownership5.setAccount(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Ownership.Account"));
		ownership5.setProvider(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Next.Ownership.Provider"));
		next.setOwnership5(ownership5);
		module.setNext(next);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInstanceDomainsResponse.Module.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDomainName(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].DomainName"));
			dataItem.setCreateTime(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].CreateTime"));
			dataItem.setOverallStatus(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].OverallStatus"));

			Verification verification = new Verification();
			verification.setVerificationStatus(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Verification.VerificationStatus"));
			verification.setErrorMsg(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Verification.ErrorMsg"));
			verification.setVerificationStatusCode(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Verification.VerificationStatusCode"));

			DnsRecord dnsRecord = new DnsRecord();
			dnsRecord.setRecordType(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Verification.DnsRecord.RecordType"));
			dnsRecord.setHost(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Verification.DnsRecord.Host"));
			dnsRecord.setValue(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Verification.DnsRecord.Value"));
			verification.setDnsRecord(dnsRecord);
			dataItem.setVerification(verification);

			Resolution resolution = new Resolution();
			resolution.setResolutionStatus(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Resolution.ResolutionStatus"));
			resolution.setErrorMsg(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Resolution.ErrorMsg"));

			DnsRecord1 dnsRecord1 = new DnsRecord1();
			dnsRecord1.setRecordType(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Resolution.DnsRecord.RecordType"));
			dnsRecord1.setHost(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Resolution.DnsRecord.Host"));
			dnsRecord1.setValue(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Resolution.DnsRecord.Value"));
			resolution.setDnsRecord1(dnsRecord1);
			dataItem.setResolution(resolution);

			Certificate certificate = new Certificate();
			certificate.setCertificateStatus(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Certificate.CertificateStatus"));
			certificate.setCertificateType(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Certificate.CertificateType"));
			certificate.setCertificateName(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Certificate.CertificateName"));
			certificate.setEndTime(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Certificate.EndTime"));
			dataItem.setCertificate(certificate);

			Ownership ownership = new Ownership();
			ownership.setAccount(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Ownership.Account"));
			ownership.setProvider(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Ownership.Provider"));
			ownership.setRootDomain(_ctx.stringValue("ListAppInstanceDomainsResponse.Module.Data["+ i +"].Ownership.RootDomain"));
			dataItem.setOwnership(ownership);

			data.add(dataItem);
		}
		module.setData(data);
		listAppInstanceDomainsResponse.setModule(module);
	 
	 	return listAppInstanceDomainsResponse;
	}
}