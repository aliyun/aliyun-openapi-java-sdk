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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserSecDropByMinuteResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserSecDropByMinuteResponse.RowsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserSecDropByMinuteResponseUnmarshaller {

	public static DescribeDcdnUserSecDropByMinuteResponse unmarshall(DescribeDcdnUserSecDropByMinuteResponse describeDcdnUserSecDropByMinuteResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserSecDropByMinuteResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserSecDropByMinuteResponse.RequestId"));
		describeDcdnUserSecDropByMinuteResponse.setDescription(_ctx.stringValue("DescribeDcdnUserSecDropByMinuteResponse.Description"));
		describeDcdnUserSecDropByMinuteResponse.setLen(_ctx.integerValue("DescribeDcdnUserSecDropByMinuteResponse.Len"));
		describeDcdnUserSecDropByMinuteResponse.setPageNumber(_ctx.integerValue("DescribeDcdnUserSecDropByMinuteResponse.PageNumber"));
		describeDcdnUserSecDropByMinuteResponse.setPageSize(_ctx.integerValue("DescribeDcdnUserSecDropByMinuteResponse.PageSize"));
		describeDcdnUserSecDropByMinuteResponse.setTotalCount(_ctx.integerValue("DescribeDcdnUserSecDropByMinuteResponse.TotalCount"));

		List<RowsItem> rows = new ArrayList<RowsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnUserSecDropByMinuteResponse.Rows.Length"); i++) {
			RowsItem rowsItem = new RowsItem();
			rowsItem.setDomain(_ctx.stringValue("DescribeDcdnUserSecDropByMinuteResponse.Rows["+ i +"].Domain"));
			rowsItem.setTmStr(_ctx.stringValue("DescribeDcdnUserSecDropByMinuteResponse.Rows["+ i +"].TmStr"));
			rowsItem.setDrops(_ctx.integerValue("DescribeDcdnUserSecDropByMinuteResponse.Rows["+ i +"].Drops"));
			rowsItem.setObject(_ctx.stringValue("DescribeDcdnUserSecDropByMinuteResponse.Rows["+ i +"].Object"));
			rowsItem.setSecFunc(_ctx.stringValue("DescribeDcdnUserSecDropByMinuteResponse.Rows["+ i +"].SecFunc"));
			rowsItem.setRuleName(_ctx.stringValue("DescribeDcdnUserSecDropByMinuteResponse.Rows["+ i +"].RuleName"));

			rows.add(rowsItem);
		}
		describeDcdnUserSecDropByMinuteResponse.setRows(rows);
	 
	 	return describeDcdnUserSecDropByMinuteResponse;
	}
}