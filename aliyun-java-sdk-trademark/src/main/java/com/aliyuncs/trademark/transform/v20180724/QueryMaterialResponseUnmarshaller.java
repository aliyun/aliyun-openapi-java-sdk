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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryMaterialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMaterialResponseUnmarshaller {

	public static QueryMaterialResponse unmarshall(QueryMaterialResponse queryMaterialResponse, UnmarshallerContext _ctx) {
		
		queryMaterialResponse.setRequestId(_ctx.stringValue("QueryMaterialResponse.RequestId"));
		queryMaterialResponse.setType(_ctx.integerValue("QueryMaterialResponse.Type"));
		queryMaterialResponse.setStatus(_ctx.integerValue("QueryMaterialResponse.Status"));
		queryMaterialResponse.setReviewApplicationFile(_ctx.stringValue("QueryMaterialResponse.ReviewApplicationFile"));
		queryMaterialResponse.setContactDistrict(_ctx.stringValue("QueryMaterialResponse.ContactDistrict"));
		queryMaterialResponse.setBusinessLicenceUrl(_ctx.stringValue("QueryMaterialResponse.BusinessLicenceUrl"));
		queryMaterialResponse.setPassportUrl(_ctx.stringValue("QueryMaterialResponse.PassportUrl"));
		queryMaterialResponse.setContactProvince(_ctx.stringValue("QueryMaterialResponse.ContactProvince"));
		queryMaterialResponse.setLegalNoticeUrl(_ctx.stringValue("QueryMaterialResponse.LegalNoticeUrl"));
		queryMaterialResponse.setCity(_ctx.stringValue("QueryMaterialResponse.City"));
		queryMaterialResponse.setEAddress(_ctx.stringValue("QueryMaterialResponse.EAddress"));
		queryMaterialResponse.setContactCounty(_ctx.stringValue("QueryMaterialResponse.ContactCounty"));
		queryMaterialResponse.setContactEmail(_ctx.stringValue("QueryMaterialResponse.ContactEmail"));
		queryMaterialResponse.setContactCity(_ctx.stringValue("QueryMaterialResponse.ContactCity"));
		queryMaterialResponse.setRegion(_ctx.integerValue("QueryMaterialResponse.Region"));
		queryMaterialResponse.setLoaUrl(_ctx.stringValue("QueryMaterialResponse.LoaUrl"));
		queryMaterialResponse.setAddress(_ctx.stringValue("QueryMaterialResponse.Address"));
		queryMaterialResponse.setNote(_ctx.stringValue("QueryMaterialResponse.Note"));
		queryMaterialResponse.setPrincipalName(_ctx.integerValue("QueryMaterialResponse.PrincipalName"));
		queryMaterialResponse.setName(_ctx.stringValue("QueryMaterialResponse.Name"));
		queryMaterialResponse.setPrincipalDescription(_ctx.stringValue("QueryMaterialResponse.PrincipalDescription"));
		queryMaterialResponse.setContactNumber(_ctx.stringValue("QueryMaterialResponse.ContactNumber"));
		queryMaterialResponse.setContactAddress(_ctx.stringValue("QueryMaterialResponse.ContactAddress"));
		queryMaterialResponse.setContactZipcode(_ctx.stringValue("QueryMaterialResponse.ContactZipcode"));
		queryMaterialResponse.setContactName(_ctx.stringValue("QueryMaterialResponse.ContactName"));
		queryMaterialResponse.setEName(_ctx.stringValue("QueryMaterialResponse.EName"));
		queryMaterialResponse.setValidDate(_ctx.longValue("QueryMaterialResponse.ValidDate"));
		queryMaterialResponse.setIdCardUrl(_ctx.stringValue("QueryMaterialResponse.IdCardUrl"));
		queryMaterialResponse.setExpirationDate(_ctx.longValue("QueryMaterialResponse.ExpirationDate"));
		queryMaterialResponse.setCardNumber(_ctx.stringValue("QueryMaterialResponse.CardNumber"));
		queryMaterialResponse.setCountry(_ctx.stringValue("QueryMaterialResponse.Country"));
		queryMaterialResponse.setTown(_ctx.stringValue("QueryMaterialResponse.Town"));
		queryMaterialResponse.setLoaStatus(_ctx.integerValue("QueryMaterialResponse.LoaStatus"));
		queryMaterialResponse.setReason(_ctx.stringValue("QueryMaterialResponse.Reason"));
		queryMaterialResponse.setId(_ctx.longValue("QueryMaterialResponse.Id"));
		queryMaterialResponse.setProvince(_ctx.stringValue("QueryMaterialResponse.Province"));
		queryMaterialResponse.setLegalNoticeKey(_ctx.stringValue("QueryMaterialResponse.LegalNoticeKey"));
		queryMaterialResponse.setIdCardNumber(_ctx.stringValue("QueryMaterialResponse.IdCardNumber"));
		queryMaterialResponse.setPersonalType(_ctx.longValue("QueryMaterialResponse.PersonalType"));
		queryMaterialResponse.setIdCardName(_ctx.stringValue("QueryMaterialResponse.IdCardName"));
		queryMaterialResponse.setMaterialVersion(_ctx.stringValue("QueryMaterialResponse.MaterialVersion"));
		queryMaterialResponse.setFgsqPath(_ctx.stringValue("QueryMaterialResponse.FgsqPath"));
		queryMaterialResponse.setFactandreasonPdfPath(_ctx.stringValue("QueryMaterialResponse.FactandreasonPdfPath"));
		queryMaterialResponse.setFileBgPath(_ctx.stringValue("QueryMaterialResponse.FileBgPath"));
		queryMaterialResponse.setFileGtPath(_ctx.stringValue("QueryMaterialResponse.FileGtPath"));
		queryMaterialResponse.setFileFsSqPath(_ctx.stringValue("QueryMaterialResponse.FileFsSqPath"));
		queryMaterialResponse.setEvidenceCatalogPath(_ctx.stringValue("QueryMaterialResponse.EvidenceCatalogPath"));
		queryMaterialResponse.setEvidencePath(_ctx.stringValue("QueryMaterialResponse.EvidencePath"));
		queryMaterialResponse.setEvidenceOfservicePath(_ctx.stringValue("QueryMaterialResponse.EvidenceOfservicePath"));
		queryMaterialResponse.setFileYgPath(_ctx.stringValue("QueryMaterialResponse.FileYgPath"));

		List<String> reviewAdditionalFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryMaterialResponse.ReviewAdditionalFiles.Length"); i++) {
			reviewAdditionalFiles.add(_ctx.stringValue("QueryMaterialResponse.ReviewAdditionalFiles["+ i +"]"));
		}
		queryMaterialResponse.setReviewAdditionalFiles(reviewAdditionalFiles);
	 
	 	return queryMaterialResponse;
	}
}