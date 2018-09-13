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

package com.aliyuncs.trademark_inner.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark_inner.model.v20180801.TrademarkDetailResponse;
import com.aliyuncs.trademark_inner.model.v20180801.TrademarkDetailResponse.AnnounceDetail;
import com.aliyuncs.trademark_inner.model.v20180801.TrademarkDetailResponse.Procedure;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class TrademarkDetailResponseUnmarshaller {

	public static TrademarkDetailResponse unmarshall(TrademarkDetailResponse trademarkDetailResponse, UnmarshallerContext context) {
		
		trademarkDetailResponse.setRequestId(context.stringValue("TrademarkDetailResponse.RequestId"));
		trademarkDetailResponse.setName(context.stringValue("TrademarkDetailResponse.Name"));
		trademarkDetailResponse.setRegistrationNumber(context.stringValue("TrademarkDetailResponse.RegistrationNumber"));
		trademarkDetailResponse.setClassification(context.stringValue("TrademarkDetailResponse.Classification"));
		trademarkDetailResponse.setApplyDate(context.stringValue("TrademarkDetailResponse.ApplyDate"));
		trademarkDetailResponse.setOwnerName(context.stringValue("TrademarkDetailResponse.OwnerName"));
		trademarkDetailResponse.setOwnerAddress(context.stringValue("TrademarkDetailResponse.OwnerAddress"));
		trademarkDetailResponse.setOwnerEnName(context.stringValue("TrademarkDetailResponse.OwnerEnName"));
		trademarkDetailResponse.setOwnerEnAddress(context.stringValue("TrademarkDetailResponse.OwnerEnAddress"));
		trademarkDetailResponse.setImage(context.stringValue("TrademarkDetailResponse.Image"));
		trademarkDetailResponse.setImageElement(context.stringValue("TrademarkDetailResponse.ImageElement"));
		trademarkDetailResponse.setSimilarGroup(context.stringValue("TrademarkDetailResponse.SimilarGroup"));
		trademarkDetailResponse.setProduct(context.stringValue("TrademarkDetailResponse.Product"));
		trademarkDetailResponse.setPreAnnNum(context.stringValue("TrademarkDetailResponse.PreAnnNum"));
		trademarkDetailResponse.setRegAnnNum(context.stringValue("TrademarkDetailResponse.RegAnnNum"));
		trademarkDetailResponse.setPreAnnDate(context.stringValue("TrademarkDetailResponse.PreAnnDate"));
		trademarkDetailResponse.setRegAnnDate(context.stringValue("TrademarkDetailResponse.RegAnnDate"));
		trademarkDetailResponse.setExclusiveDateLimit(context.stringValue("TrademarkDetailResponse.ExclusiveDateLimit"));
		trademarkDetailResponse.setShare(context.integerValue("TrademarkDetailResponse.Share"));
		trademarkDetailResponse.setSubsequentDesignationDate(context.stringValue("TrademarkDetailResponse.SubsequentDesignationDate"));
		trademarkDetailResponse.setIntlRegDate(context.stringValue("TrademarkDetailResponse.IntlRegDate"));
		trademarkDetailResponse.setPriorityDate(context.stringValue("TrademarkDetailResponse.PriorityDate"));
		trademarkDetailResponse.setAgency(context.stringValue("TrademarkDetailResponse.Agency"));
		trademarkDetailResponse.setStatus(context.stringValue("TrademarkDetailResponse.Status"));
		trademarkDetailResponse.setProductDesc(context.stringValue("TrademarkDetailResponse.ProductDesc"));
		trademarkDetailResponse.setLastProcedureStatus(context.stringValue("TrademarkDetailResponse.LastProcedureStatus"));
		trademarkDetailResponse.setRegistrationType(context.stringValue("TrademarkDetailResponse.RegistrationType"));

		List<AnnounceDetail> announces = new ArrayList<AnnounceDetail>();
		for (int i = 0; i < context.lengthValue("TrademarkDetailResponse.Announces.Length"); i++) {
			AnnounceDetail announceDetail = new AnnounceDetail();
			announceDetail.setAnnNum(context.stringValue("TrademarkDetailResponse.Announces["+ i +"].AnnNum"));
			announceDetail.setAnnTypeCode(context.stringValue("TrademarkDetailResponse.Announces["+ i +"].AnnTypeCode"));
			announceDetail.setAnnTypeName(context.stringValue("TrademarkDetailResponse.Announces["+ i +"].AnnTypeName"));
			announceDetail.setAnnDate(context.stringValue("TrademarkDetailResponse.Announces["+ i +"].AnnDate"));
			announceDetail.setImageUrl(context.stringValue("TrademarkDetailResponse.Announces["+ i +"].ImageUrl"));
			announceDetail.setPageNo(context.integerValue("TrademarkDetailResponse.Announces["+ i +"].PageNo"));

			announces.add(announceDetail);
		}
		trademarkDetailResponse.setAnnounces(announces);

		List<Procedure> procedures = new ArrayList<Procedure>();
		for (int i = 0; i < context.lengthValue("TrademarkDetailResponse.Procedures.Length"); i++) {
			Procedure procedure = new Procedure();
			procedure.setProcedureCode(context.stringValue("TrademarkDetailResponse.Procedures["+ i +"].ProcedureCode"));
			procedure.setProcedureName(context.stringValue("TrademarkDetailResponse.Procedures["+ i +"].ProcedureName"));
			procedure.setProcedureStep(context.stringValue("TrademarkDetailResponse.Procedures["+ i +"].ProcedureStep"));
			procedure.setProcedureResult(context.stringValue("TrademarkDetailResponse.Procedures["+ i +"].ProcedureResult"));
			procedure.setProcedureDate(context.stringValue("TrademarkDetailResponse.Procedures["+ i +"].ProcedureDate"));

			procedures.add(procedure);
		}
		trademarkDetailResponse.setProcedures(procedures);
	 
	 	return trademarkDetailResponse;
	}
}