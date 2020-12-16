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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.ListBookkeepingStatisticsesResponse;
import com.aliyuncs.companyreg.model.v20190508.ListBookkeepingStatisticsesResponse.BookkeepingStatistics;
import com.aliyuncs.companyreg.model.v20190508.ListBookkeepingStatisticsesResponse.BookkeepingStatistics.TaxDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBookkeepingStatisticsesResponseUnmarshaller {

	public static ListBookkeepingStatisticsesResponse unmarshall(ListBookkeepingStatisticsesResponse listBookkeepingStatisticsesResponse, UnmarshallerContext _ctx) {
		
		listBookkeepingStatisticsesResponse.setRequestId(_ctx.stringValue("ListBookkeepingStatisticsesResponse.RequestId"));
		listBookkeepingStatisticsesResponse.setTotalCount(_ctx.integerValue("ListBookkeepingStatisticsesResponse.TotalCount"));
		listBookkeepingStatisticsesResponse.setPageSize(_ctx.integerValue("ListBookkeepingStatisticsesResponse.PageSize"));
		listBookkeepingStatisticsesResponse.setPageNumber(_ctx.integerValue("ListBookkeepingStatisticsesResponse.PageNumber"));
		listBookkeepingStatisticsesResponse.setIncomeSum(_ctx.floatValue("ListBookkeepingStatisticsesResponse.IncomeSum"));
		listBookkeepingStatisticsesResponse.setExpendSum(_ctx.floatValue("ListBookkeepingStatisticsesResponse.ExpendSum"));
		listBookkeepingStatisticsesResponse.setProfitSum(_ctx.floatValue("ListBookkeepingStatisticsesResponse.ProfitSum"));
		listBookkeepingStatisticsesResponse.setTaxAmountSum(_ctx.floatValue("ListBookkeepingStatisticsesResponse.TaxAmountSum"));

		List<BookkeepingStatistics> bookkeepingStatisticses = new ArrayList<BookkeepingStatistics>();
		for (int i = 0; i < _ctx.lengthValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses.Length"); i++) {
			BookkeepingStatistics bookkeepingStatistics = new BookkeepingStatistics();
			bookkeepingStatistics.setProduceBizId(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].ProduceBizId"));
			bookkeepingStatistics.setYear(_ctx.integerValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].Year"));
			bookkeepingStatistics.setMonth(_ctx.integerValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].Month"));
			bookkeepingStatistics.setIncome(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].Income"));
			bookkeepingStatistics.setExpend(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].Expend"));
			bookkeepingStatistics.setProfit(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].Profit"));
			bookkeepingStatistics.setTaxAmount(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxAmount"));
			bookkeepingStatistics.setTaxZzs(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxZzs"));
			bookkeepingStatistics.setTaxFjs(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxFjs"));
			bookkeepingStatistics.setTaxQysds(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxQysds"));
			bookkeepingStatistics.setTaxYhs(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxYhs"));
			bookkeepingStatistics.setTaxGhjf(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxGhjf"));
			bookkeepingStatistics.setTaxSljj(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxSljj"));
			bookkeepingStatistics.setTaxCjrbzj(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxCjrbzj"));
			bookkeepingStatistics.setTaxOther(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxOther"));
			bookkeepingStatistics.setTaxAmountNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxAmountNote"));
			bookkeepingStatistics.setTaxZzsNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxZzsNote"));
			bookkeepingStatistics.setTaxFjsNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxFjsNote"));
			bookkeepingStatistics.setTaxQysdsNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxQysdsNote"));
			bookkeepingStatistics.setTaxYhsNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxYhsNote"));
			bookkeepingStatistics.setTaxGhjfNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxGhjfNote"));
			bookkeepingStatistics.setTaxSljjNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxSljjNote"));
			bookkeepingStatistics.setTaxCjrbzjNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxCjrbzjNote"));
			bookkeepingStatistics.setTaxOtherNote(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxOtherNote"));
			bookkeepingStatistics.setVoucherCount(_ctx.integerValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].VoucherCount"));
			bookkeepingStatistics.setSubjectCount(_ctx.integerValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].SubjectCount"));

			List<TaxDetail> taxDetails = new ArrayList<TaxDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxDetails.Length"); j++) {
				TaxDetail taxDetail = new TaxDetail();
				taxDetail.setTaxName(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxDetails["+ j +"].TaxName"));
				taxDetail.setYear(_ctx.integerValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxDetails["+ j +"].Year"));
				taxDetail.setMonth(_ctx.integerValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxDetails["+ j +"].Month"));
				taxDetail.setAmount(_ctx.floatValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxDetails["+ j +"].Amount"));
				taxDetail.setRemark(_ctx.stringValue("ListBookkeepingStatisticsesResponse.BookkeepingStatisticses["+ i +"].TaxDetails["+ j +"].Remark"));

				taxDetails.add(taxDetail);
			}
			bookkeepingStatistics.setTaxDetails(taxDetails);

			bookkeepingStatisticses.add(bookkeepingStatistics);
		}
		listBookkeepingStatisticsesResponse.setBookkeepingStatisticses(bookkeepingStatisticses);
	 
	 	return listBookkeepingStatisticsesResponse;
	}
}