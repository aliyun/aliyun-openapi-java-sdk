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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescirbeCombineTrademarkResponseUnmarshaller {

	public static DescirbeCombineTrademarkResponse unmarshall(DescirbeCombineTrademarkResponse descirbeCombineTrademarkResponse, UnmarshallerContext _ctx) {
		
		descirbeCombineTrademarkResponse.setRequestId(_ctx.stringValue("DescirbeCombineTrademarkResponse.RequestId"));
		descirbeCombineTrademarkResponse.setTotalItemNumber(_ctx.integerValue("DescirbeCombineTrademarkResponse.TotalItemNumber"));
		descirbeCombineTrademarkResponse.setCurrentPageNumber(_ctx.integerValue("DescirbeCombineTrademarkResponse.CurrentPageNumber"));
		descirbeCombineTrademarkResponse.setPageSize(_ctx.integerValue("DescirbeCombineTrademarkResponse.PageSize"));
		descirbeCombineTrademarkResponse.setTotalPageNumber(_ctx.integerValue("DescirbeCombineTrademarkResponse.TotalPageNumber"));
		descirbeCombineTrademarkResponse.setPrePage(_ctx.booleanValue("DescirbeCombineTrademarkResponse.PrePage"));
		descirbeCombineTrademarkResponse.setNextPage(_ctx.booleanValue("DescirbeCombineTrademarkResponse.NextPage"));
		descirbeCombineTrademarkResponse.setProductDescription(_ctx.stringValue("DescirbeCombineTrademarkResponse.ProductDescription"));
		descirbeCombineTrademarkResponse.setExclusiveDateLimit(_ctx.stringValue("DescirbeCombineTrademarkResponse.ExclusiveDateLimit"));
		descirbeCombineTrademarkResponse.setAgency(_ctx.stringValue("DescirbeCombineTrademarkResponse.Agency"));

		List<Trademark> data = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("DescirbeCombineTrademarkResponse.Data.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setIndexId(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].IndexId"));
			trademark.setName(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Name"));
			trademark.setRegistrationNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].RegistrationNumber"));
			trademark.setClassification(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Classification"));
			trademark.setApplyDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].ApplyDate"));
			trademark.setOwnerName(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OwnerName"));
			trademark.setOwnerEnName(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OwnerEnName"));
			trademark.setImage(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Image"));
			trademark.setProduct(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Product"));
			trademark.setPreAnnNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].PreAnnNumber"));
			trademark.setRegAnnNumber(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].RegAnnNumber"));
			trademark.setPreAnnDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].PreAnnDate"));
			trademark.setRegAnnDate(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].RegAnnDate"));
			trademark.setLawFinalStatus(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].LawFinalStatus"));
			trademark.setLastProcedureStatus(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].LastProcedureStatus"));
			trademark.setShare(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].Share"));
			trademark.setOwnerAddress(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OwnerAddress"));
			trademark.setOwnerEnAddress(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].OwnerEnAddress"));

			List<String> announcementList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList.Length"); j++) {
				announcementList.add(_ctx.stringValue("DescirbeCombineTrademarkResponse.Data["+ i +"].AnnouncementList["+ j +"]"));
			}
			trademark.setAnnouncementList(announcementList);

			data.add(trademark);
		}
		descirbeCombineTrademarkResponse.setData(data);
	 
	 	return descirbeCombineTrademarkResponse;
	}
}