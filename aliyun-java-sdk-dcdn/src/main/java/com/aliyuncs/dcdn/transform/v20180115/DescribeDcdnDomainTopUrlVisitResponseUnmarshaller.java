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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainTopUrlVisitResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainTopUrlVisitResponse.UrlList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainTopUrlVisitResponseUnmarshaller {

	public static DescribeDcdnDomainTopUrlVisitResponse unmarshall(DescribeDcdnDomainTopUrlVisitResponse describeDcdnDomainTopUrlVisitResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainTopUrlVisitResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.RequestId"));
		describeDcdnDomainTopUrlVisitResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.StartTime"));
		describeDcdnDomainTopUrlVisitResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.DomainName"));

		List<UrlList> allUrlList = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].Flow"));
			urlList.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].UrlDetail"));
			urlList.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].FlowProportion"));
			urlList.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitData"));
			urlList.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitProportion"));

			allUrlList.add(urlList);
		}
		describeDcdnDomainTopUrlVisitResponse.setAllUrlList(allUrlList);

		List<UrlList> url200List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List.Length"); i++) {
			UrlList urlList1 = new UrlList();
			urlList1.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].Flow"));
			urlList1.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].UrlDetail"));
			urlList1.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].FlowProportion"));
			urlList1.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitData"));
			urlList1.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitProportion"));

			url200List.add(urlList1);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl200List(url200List);

		List<UrlList> url300List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List.Length"); i++) {
			UrlList urlList2 = new UrlList();
			urlList2.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].Flow"));
			urlList2.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].UrlDetail"));
			urlList2.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].FlowProportion"));
			urlList2.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitData"));
			urlList2.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitProportion"));

			url300List.add(urlList2);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl300List(url300List);

		List<UrlList> url400List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List.Length"); i++) {
			UrlList urlList3 = new UrlList();
			urlList3.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].Flow"));
			urlList3.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].UrlDetail"));
			urlList3.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].FlowProportion"));
			urlList3.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitData"));
			urlList3.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitProportion"));

			url400List.add(urlList3);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl400List(url400List);

		List<UrlList> url500List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List.Length"); i++) {
			UrlList urlList4 = new UrlList();
			urlList4.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].Flow"));
			urlList4.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].UrlDetail"));
			urlList4.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].FlowProportion"));
			urlList4.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitData"));
			urlList4.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitProportion"));

			url500List.add(urlList4);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl500List(url500List);
	 
	 	return describeDcdnDomainTopUrlVisitResponse;
	}
}