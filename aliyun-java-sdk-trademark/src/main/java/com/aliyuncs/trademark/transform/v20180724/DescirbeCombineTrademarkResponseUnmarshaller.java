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

import com.aliyuncs.trademark.model.v20180724.DescirbeCombineTrademarkResponse;
import com.aliyuncs.trademark.model.v20180724.DescirbeCombineTrademarkResponse.Trademark;
import com.aliyuncs.trademark.model.v20180724.DescirbeCombineTrademarkResponse.Trademark.AnnouncementListItem;
import com.aliyuncs.trademark.model.v20180724.DescirbeCombineTrademarkResponse.Trademark.ProcedureList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescirbeCombineTrademarkResponseUnmarshaller {

	public static DescirbeCombineTrademarkResponse unmarshall(DescirbeCombineTrademarkResponse descirbeCombineTrademarkResponse, UnmarshallerContext _ctx) {
		
		descirbeCombineTrademarkResponse.setRequestId(_ctx.stringValue("DescirbeCombineTrademarkResponse.RequestId"));
		descirbeCombineTrademarkResponse.setNextPage(_ctx.booleanValue("DescirbeCombineTrademarkResponse.NextPage"));
		descirbeCombineTrademarkResponse.setTotalPageNumber(_ctx.integerValue("DescirbeCombineTrademarkResponse.TotalPageNumber"));
		descirbeCombineTrademarkResponse.setPrePage(_ctx.booleanValue("DescirbeCombineTrademarkResponse.PrePage"));
		descirbeCombineTrademarkResponse.setCurrentPageNumber(_ctx.integerValue("DescirbeCombineTrademarkResponse.CurrentPageNumber"));
		descirbeCombineTrademarkResponse.setTotalItemNumber(_ctx.integerValue("DescirbeCombineTrademarkResponse.TotalItemNumber"));
		descirbeCombineTrademarkResponse.setPageSize(_ctx.integerValue("DescirbeCombineTrademarkResponse.PageSize"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("DescirbeCombineTrademarkResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setStatus(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Status"));
			trademark.setOwnerAddress(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OwnerAddress"));
			trademark.setPreAnnDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].PreAnnDate"));
			trademark.setPreAnnNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].PreAnnNumber"));
			trademark.setIntlRegDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].IntlRegDate"));
			trademark.setShare(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Share"));
			trademark.setOwnerEnName(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OwnerEnName"));
			trademark.setSubsequentDesignationDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].SubsequentDesignationDate"));
			trademark.setIndexId(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].IndexId"));
			trademark.setRegAnnNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].RegAnnNumber"));
			trademark.setRegistrationNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].RegistrationNumber"));
			trademark.setSecondAnnoType(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].SecondAnnoType"));
			trademark.setAgency(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Agency"));
			trademark.setOwnerEnAddress(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OwnerEnAddress"));
			trademark.setClassification(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Classification"));
			trademark.setName(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Name"));
			trademark.setApplyDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].ApplyDate"));
			trademark.setPriorityDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].PriorityDate"));
			trademark.setProductDescription(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].ProductDescription"));
			trademark.setImage(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Image"));
			trademark.setSecondAnnoNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].SecondAnnoNumber"));
			trademark.setRegistrationType(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].RegistrationType"));
			trademark.setFirstAnnoNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].FirstAnnoNumber"));
			trademark.setOwnerName(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OwnerName"));
			trademark.setRegAnnDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].RegAnnDate"));
			trademark.setSimilarGroup(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].SimilarGroup"));
			trademark.setOnSale(_ctx.integerValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OnSale"));
			trademark.setExclusiveDateLimit(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].ExclusiveDateLimit"));
			trademark.setFirstAnnoType(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].FirstAnnoType"));
			trademark.setLastProcedureStatus(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].LastProcedureStatus"));
			trademark.setLawFinalStatus(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].LawFinalStatus"));

			List<AnnouncementListItem> announcementList = new ArrayList<AnnouncementListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList.Length"); j++) {
				AnnouncementListItem announcementListItem = new AnnouncementListItem();
				announcementListItem.setImageUrl(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList["+ j +"].ImageUrl"));
				announcementListItem.setAnnDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList["+ j +"].AnnDate"));
				announcementListItem.setOriginalImageUrl(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList["+ j +"].OriginalImageUrl"));
				announcementListItem.setAnnTypeName(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList["+ j +"].AnnTypeName"));
				announcementListItem.setAnnNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList["+ j +"].AnnNumber"));
				announcementListItem.setAnnTypeCode(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList["+ j +"].AnnTypeCode"));

				announcementList.add(announcementListItem);
			}
			trademark.setAnnouncementList(announcementList);

			List<ProcedureList> procedures = new ArrayList<ProcedureList>();
			for (int j = 0; j < _ctx.lengthValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Procedures.Length"); j++) {
				ProcedureList procedureList = new ProcedureList();
				procedureList.setProcedureStep(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Procedures["+ j +"].ProcedureStep"));
				procedureList.setProcedureResult(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Procedures["+ j +"].ProcedureResult"));
				procedureList.setProcedureCode(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Procedures["+ j +"].ProcedureCode"));
				procedureList.setProcedureDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Procedures["+ j +"].ProcedureDate"));
				procedureList.setProcedureName(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Procedures["+ j +"].ProcedureName"));

				procedures.add(procedureList);
			}
			trademark.setProcedures(procedures);

			data.add(trademark);
		}
		descirbeCombineTrademarkResponse.setData(data);
	 
	 	return descirbeCombineTrademarkResponse;
	}
}