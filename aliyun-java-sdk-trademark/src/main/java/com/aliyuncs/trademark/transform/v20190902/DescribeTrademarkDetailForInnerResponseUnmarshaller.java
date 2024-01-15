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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.DescribeTrademarkDetailForInnerResponse;
import com.aliyuncs.trademark.model.v20190902.DescribeTrademarkDetailForInnerResponse.Flow;
import com.aliyuncs.trademark.model.v20190902.DescribeTrademarkDetailForInnerResponse.NoticeDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTrademarkDetailForInnerResponseUnmarshaller {

	public static DescribeTrademarkDetailForInnerResponse unmarshall(DescribeTrademarkDetailForInnerResponse describeTrademarkDetailForInnerResponse, UnmarshallerContext _ctx) {
		
		describeTrademarkDetailForInnerResponse.setRequestId(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.RequestId"));
		describeTrademarkDetailForInnerResponse.setStatus(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.Status"));
		describeTrademarkDetailForInnerResponse.setOwnerAddress(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.OwnerAddress"));
		describeTrademarkDetailForInnerResponse.setPreAnnDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.PreAnnDate"));
		describeTrademarkDetailForInnerResponse.setIntlRegDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.IntlRegDate"));
		describeTrademarkDetailForInnerResponse.setPreAnnNum(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.PreAnnNum"));
		describeTrademarkDetailForInnerResponse.setShare(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.Share"));
		describeTrademarkDetailForInnerResponse.setImageElement(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.ImageElement"));
		describeTrademarkDetailForInnerResponse.setOwnerEnName(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.OwnerEnName"));
		describeTrademarkDetailForInnerResponse.setSubsequentDesignationDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.SubsequentDesignationDate"));
		describeTrademarkDetailForInnerResponse.setRegistrationNumber(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.RegistrationNumber"));
		describeTrademarkDetailForInnerResponse.setAgency(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.Agency"));
		describeTrademarkDetailForInnerResponse.setOwnerEnAddress(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.OwnerEnAddress"));
		describeTrademarkDetailForInnerResponse.setName(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.Name"));
		describeTrademarkDetailForInnerResponse.setClassification(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.Classification"));
		describeTrademarkDetailForInnerResponse.setApplyDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.ApplyDate"));
		describeTrademarkDetailForInnerResponse.setUid(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.Uid"));
		describeTrademarkDetailForInnerResponse.setProductDescription(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.ProductDescription"));
		describeTrademarkDetailForInnerResponse.setPriorityDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.PriorityDate"));
		describeTrademarkDetailForInnerResponse.setImage(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.Image"));
		describeTrademarkDetailForInnerResponse.setProduct(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.Product"));
		describeTrademarkDetailForInnerResponse.setRegistrationType(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.RegistrationType"));
		describeTrademarkDetailForInnerResponse.setOwnerName(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.OwnerName"));
		describeTrademarkDetailForInnerResponse.setRegAnnDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.RegAnnDate"));
		describeTrademarkDetailForInnerResponse.setSimilarGroup(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.SimilarGroup"));
		describeTrademarkDetailForInnerResponse.setExclusiveDateLimit(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.ExclusiveDateLimit"));
		describeTrademarkDetailForInnerResponse.setLastProcedureStatus(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.LastProcedureStatus"));
		describeTrademarkDetailForInnerResponse.setRegAnnNum(_ctx.integerValue("DescribeTrademarkDetailForInnerResponse.RegAnnNum"));

		List<NoticeDTO> noticeList = new ArrayList<NoticeDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkDetailForInnerResponse.NoticeList.Length"); i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setTrademarkName(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].TrademarkName"));
			noticeDTO.setImageUrl(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].ImageUrl"));
			noticeDTO.setOriginalImageUrl(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].OriginalImageUrl"));
			noticeDTO.setDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].Date"));
			noticeDTO.setAnnTypeName(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].AnnTypeName"));
			noticeDTO.setApplicant(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].Applicant"));
			noticeDTO.setAnnNum(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].AnnNum"));
			noticeDTO.setReactNum(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].ReactNum"));
			noticeDTO.setRegistrationNumber(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].RegistrationNumber"));
			noticeDTO.setAnnId(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].AnnId"));
			noticeDTO.setAnnDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].AnnDate"));
			noticeDTO.setPageNo(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].PageNo"));
			noticeDTO.setAnnTypeCode(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.NoticeList["+ i +"].AnnTypeCode"));

			noticeList.add(noticeDTO);
		}
		describeTrademarkDetailForInnerResponse.setNoticeList(noticeList);

		List<Flow> flowList = new ArrayList<Flow>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrademarkDetailForInnerResponse.FlowList.Length"); i++) {
			Flow flow = new Flow();
			flow.setProcedureCode(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.FlowList["+ i +"].ProcedureCode"));
			flow.setRegistrationNumber(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.FlowList["+ i +"].RegistrationNumber"));
			flow.setProcedureName(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.FlowList["+ i +"].ProcedureName"));
			flow.setDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.FlowList["+ i +"].Date"));
			flow.setProcedureStep(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.FlowList["+ i +"].ProcedureStep"));
			flow.setProcedureResult(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.FlowList["+ i +"].ProcedureResult"));
			flow.setProcedureDate(_ctx.stringValue("DescribeTrademarkDetailForInnerResponse.FlowList["+ i +"].ProcedureDate"));

			flowList.add(flow);
		}
		describeTrademarkDetailForInnerResponse.setFlowList(flowList);
	 
	 	return describeTrademarkDetailForInnerResponse;
	}
}