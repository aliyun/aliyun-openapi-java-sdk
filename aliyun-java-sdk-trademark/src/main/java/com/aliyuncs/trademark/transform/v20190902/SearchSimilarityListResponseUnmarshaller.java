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

import com.aliyuncs.trademark.model.v20190902.SearchSimilarityListResponse;
import com.aliyuncs.trademark.model.v20190902.SearchSimilarityListResponse.Trademarks;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchSimilarityListResponseUnmarshaller {

	public static SearchSimilarityListResponse unmarshall(SearchSimilarityListResponse searchSimilarityListResponse, UnmarshallerContext _ctx) {
		
		searchSimilarityListResponse.setRequestId(_ctx.stringValue("SearchSimilarityListResponse.RequestId"));
		searchSimilarityListResponse.setPageNumber(_ctx.integerValue("SearchSimilarityListResponse.PageNumber"));
		searchSimilarityListResponse.setPageSize(_ctx.integerValue("SearchSimilarityListResponse.PageSize"));
		searchSimilarityListResponse.setTotalCount(_ctx.integerValue("SearchSimilarityListResponse.TotalCount"));

		List<Trademarks> data = new ArrayList<Trademarks>();
		for (int i = 0; i < _ctx.lengthValue("SearchSimilarityListResponse.Data.Length"); i++) {
			Trademarks trademarks = new Trademarks();
			trademarks.setStatus(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].Status"));
			trademarks.setPreAnnDate(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].PreAnnDate"));
			trademarks.setOwnerAddress(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].OwnerAddress"));
			trademarks.setImage(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].Image"));
			trademarks.setShare(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].Share"));
			trademarks.setProduct(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].Product"));
			trademarks.setPreAnnNum(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].PreAnnNum"));
			trademarks.setOwnerEnName(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].OwnerEnName"));
			trademarks.setOwnerName(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].OwnerName"));
			trademarks.setRegAnnDate(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].RegAnnDate"));
			trademarks.setProductDesc(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].ProductDesc"));
			trademarks.setOnSale(_ctx.integerValue("SearchSimilarityListResponse.Data["+ i +"].OnSale"));
			trademarks.setRegistrationNumber(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].RegistrationNumber"));
			trademarks.setExclusiveDateLimit(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].ExclusiveDateLimit"));
			trademarks.setLastProcedureStatus(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].LastProcedureStatus"));
			trademarks.setRegAnnNum(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].RegAnnNum"));
			trademarks.setOwnerEnAddress(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].OwnerEnAddress"));
			trademarks.setName(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].Name"));
			trademarks.setClassification(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].Classification"));
			trademarks.setId(_ctx.longValue("SearchSimilarityListResponse.Data["+ i +"].Id"));
			trademarks.setApplyDate(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].ApplyDate"));
			trademarks.setUid(_ctx.stringValue("SearchSimilarityListResponse.Data["+ i +"].Uid"));

			data.add(trademarks);
		}
		searchSimilarityListResponse.setData(data);
	 
	 	return searchSimilarityListResponse;
	}
}