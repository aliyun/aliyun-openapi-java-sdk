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
		describeDcdnDomainTopUrlVisitResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.DomainName"));
		describeDcdnDomainTopUrlVisitResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.StartTime"));

		List<UrlList> allUrlList = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].UrlDetail"));
			urlList.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitData"));
			urlList.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].VisitProportion"));
			urlList.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].Flow"));
			urlList.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.AllUrlList["+ i +"].FlowProportion"));

			allUrlList.add(urlList);
		}
		describeDcdnDomainTopUrlVisitResponse.setAllUrlList(allUrlList);

		List<UrlList> url200List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List.Length"); i++) {
			UrlList urlList_ = new UrlList();
			urlList_.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].UrlDetail"));
			urlList_.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitData"));
			urlList_.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].VisitProportion"));
			urlList_.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].Flow"));
			urlList_.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url200List["+ i +"].FlowProportion"));

			url200List.add(urlList_);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl200List(url200List);

		List<UrlList> url300List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List.Length"); i++) {
			UrlList urlList_ = new UrlList();
			urlList_.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].UrlDetail"));
			urlList_.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitData"));
			urlList_.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].VisitProportion"));
			urlList_.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].Flow"));
			urlList_.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url300List["+ i +"].FlowProportion"));

			url300List.add(urlList_);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl300List(url300List);

		List<UrlList> url400List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List.Length"); i++) {
			UrlList urlList_ = new UrlList();
			urlList_.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].UrlDetail"));
			urlList_.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitData"));
			urlList_.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].VisitProportion"));
			urlList_.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].Flow"));
			urlList_.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url400List["+ i +"].FlowProportion"));

			url400List.add(urlList_);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl400List(url400List);

		List<UrlList> url500List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List.Length"); i++) {
			UrlList urlList_ = new UrlList();
			urlList_.setUrlDetail(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].UrlDetail"));
			urlList_.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitData"));
			urlList_.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].VisitProportion"));
			urlList_.setFlow(_ctx.stringValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].Flow"));
			urlList_.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopUrlVisitResponse.Url500List["+ i +"].FlowProportion"));

			url500List.add(urlList_);
		}
		describeDcdnDomainTopUrlVisitResponse.setUrl500List(url500List);
	 
	 	return describeDcdnDomainTopUrlVisitResponse;
	}
}