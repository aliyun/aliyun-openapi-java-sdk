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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400RealNameResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400RealNameResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400RealNameResponse.Data.Number400RealNameDomain;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400RealNameResponse.Data.Number400RealNameDomain.Number400CorpIdentifyDomain;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400RealNameResponse.Data.Number400RealNameDomain.Number400CorpIdentifyDomain.Number400Domain;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryNumber400RealNameResponse.Data.Number400RealNameDomain.Number400CorpIdentifyDomain.Number400Domain.LevelDomain;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNumber400RealNameResponseUnmarshaller {

	public static QueryNumber400RealNameResponse unmarshall(QueryNumber400RealNameResponse queryNumber400RealNameResponse, UnmarshallerContext context) {
		
		queryNumber400RealNameResponse.setRequestId(context.stringValue("QueryNumber400RealNameResponse.RequestId"));
		queryNumber400RealNameResponse.setSuccess(context.booleanValue("QueryNumber400RealNameResponse.Success"));
		queryNumber400RealNameResponse.setCode(context.stringValue("QueryNumber400RealNameResponse.Code"));
		queryNumber400RealNameResponse.setMessage(context.stringValue("QueryNumber400RealNameResponse.Message"));
		queryNumber400RealNameResponse.setHttpStatusCode(context.integerValue("QueryNumber400RealNameResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("QueryNumber400RealNameResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("QueryNumber400RealNameResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("QueryNumber400RealNameResponse.Data.PageSize"));

		List<Number400RealNameDomain> list = new ArrayList<Number400RealNameDomain>();
		for (int i = 0; i < context.lengthValue("QueryNumber400RealNameResponse.Data.List.Length"); i++) {
			Number400RealNameDomain number400RealNameDomain = new Number400RealNameDomain();
			number400RealNameDomain.setCorpName(context.stringValue("QueryNumber400RealNameResponse.Data.List["+ i +"].CorpName"));

			List<Number400CorpIdentifyDomain> number400CorpIdentify = new ArrayList<Number400CorpIdentifyDomain>();
			for (int j = 0; j < context.lengthValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify.Length"); j++) {
				Number400CorpIdentifyDomain number400CorpIdentifyDomain = new Number400CorpIdentifyDomain();
				number400CorpIdentifyDomain.setCorpName(context.stringValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].CorpName"));
				number400CorpIdentifyDomain.setSpecId(context.longValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].SpecId"));
				number400CorpIdentifyDomain.setSpecName(context.stringValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].SpecName"));
				number400CorpIdentifyDomain.setRemainCount(context.integerValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].RemainCount"));
				number400CorpIdentifyDomain.setBuyCountLimit(context.integerValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].BuyCountLimit"));
				number400CorpIdentifyDomain.setRealNameInsId(context.longValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].RealNameInsId"));
				number400CorpIdentifyDomain.setCanModifyIdentify(context.booleanValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].CanModifyIdentify"));
				number400CorpIdentifyDomain.setOrderId(context.stringValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].OrderId"));

				List<Number400Domain> cuteNumbers = new ArrayList<Number400Domain>();
				for (int k = 0; k < context.lengthValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].CuteNumbers.Length"); k++) {
					Number400Domain number400Domain = new Number400Domain();
					number400Domain.setLevel(context.stringValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].CuteNumbers["+ k +"].Level"));

					LevelDomain levelDomain = new LevelDomain();
					levelDomain.setPrice(context.integerValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].CuteNumbers["+ k +"].LevelDomain.Price"));
					levelDomain.setDescription(context.stringValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].CuteNumbers["+ k +"].LevelDomain.Description"));
					levelDomain.setStockCount(context.stringValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].CuteNumbers["+ k +"].LevelDomain.StockCount"));
					levelDomain.setLevel(context.integerValue("QueryNumber400RealNameResponse.Data.List["+ i +"].Number400CorpIdentify["+ j +"].CuteNumbers["+ k +"].LevelDomain.Level"));
					number400Domain.setLevelDomain(levelDomain);

					cuteNumbers.add(number400Domain);
				}
				number400CorpIdentifyDomain.setCuteNumbers(cuteNumbers);

				number400CorpIdentify.add(number400CorpIdentifyDomain);
			}
			number400RealNameDomain.setNumber400CorpIdentify(number400CorpIdentify);

			list.add(number400RealNameDomain);
		}
		data.setList(list);
		queryNumber400RealNameResponse.setData(data);
	 
	 	return queryNumber400RealNameResponse;
	}
}