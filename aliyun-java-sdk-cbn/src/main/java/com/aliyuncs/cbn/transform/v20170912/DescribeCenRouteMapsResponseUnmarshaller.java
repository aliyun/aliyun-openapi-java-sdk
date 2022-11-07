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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeCenRouteMapsResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenRouteMapsResponse.RouteMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenRouteMapsResponseUnmarshaller {

	public static DescribeCenRouteMapsResponse unmarshall(DescribeCenRouteMapsResponse describeCenRouteMapsResponse, UnmarshallerContext _ctx) {
		
		describeCenRouteMapsResponse.setRequestId(_ctx.stringValue("DescribeCenRouteMapsResponse.RequestId"));
		describeCenRouteMapsResponse.setPageSize(_ctx.integerValue("DescribeCenRouteMapsResponse.PageSize"));
		describeCenRouteMapsResponse.setPageNumber(_ctx.integerValue("DescribeCenRouteMapsResponse.PageNumber"));
		describeCenRouteMapsResponse.setTotalCount(_ctx.integerValue("DescribeCenRouteMapsResponse.TotalCount"));

		List<RouteMap> routeMaps = new ArrayList<RouteMap>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps.Length"); i++) {
			RouteMap routeMap = new RouteMap();
			routeMap.setRouteMapId(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].RouteMapId"));
			routeMap.setStatus(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].Status"));
			routeMap.setTransmitDirection(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].TransmitDirection"));
			routeMap.setSourceInstanceIdsReverseMatch(_ctx.booleanValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceInstanceIdsReverseMatch"));
			routeMap.setCenRegionId(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].CenRegionId"));
			routeMap.setCenId(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].CenId"));
			routeMap.setPriority(_ctx.integerValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].Priority"));
			routeMap.setTransitRouterRouteTableId(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].TransitRouterRouteTableId"));
			routeMap.setCommunityOperateMode(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].CommunityOperateMode"));
			routeMap.setMapResult(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].MapResult"));
			routeMap.setCommunityMatchMode(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].CommunityMatchMode"));
			routeMap.setDescription(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].Description"));
			routeMap.setAsPathMatchMode(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].AsPathMatchMode"));
			routeMap.setPreference(_ctx.integerValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].Preference"));
			routeMap.setDestinationInstanceIdsReverseMatch(_ctx.booleanValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationInstanceIdsReverseMatch"));
			routeMap.setCidrMatchMode(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].CidrMatchMode"));
			routeMap.setNextPriority(_ctx.integerValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].NextPriority"));
			routeMap.setMatchAddressType(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].MatchAddressType"));
			routeMap.setGatewayZoneId(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].GatewayZoneId"));
			routeMap.setGatewayRegionId(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].GatewayRegionId"));

			List<String> sourceRegionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceRegionIds.Length"); j++) {
				sourceRegionIds.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceRegionIds["+ j +"]"));
			}
			routeMap.setSourceRegionIds(sourceRegionIds);

			List<String> sourceChildInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceChildInstanceTypes.Length"); j++) {
				sourceChildInstanceTypes.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceChildInstanceTypes["+ j +"]"));
			}
			routeMap.setSourceChildInstanceTypes(sourceChildInstanceTypes);

			List<String> destinationRouteTableIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationRouteTableIds.Length"); j++) {
				destinationRouteTableIds.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationRouteTableIds["+ j +"]"));
			}
			routeMap.setDestinationRouteTableIds(destinationRouteTableIds);

			List<String> sourceInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceInstanceIds.Length"); j++) {
				sourceInstanceIds.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceInstanceIds["+ j +"]"));
			}
			routeMap.setSourceInstanceIds(sourceInstanceIds);

			List<String> destinationCidrBlocks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationCidrBlocks.Length"); j++) {
				destinationCidrBlocks.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationCidrBlocks["+ j +"]"));
			}
			routeMap.setDestinationCidrBlocks(destinationCidrBlocks);

			List<String> destinationRegionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationRegionIds.Length"); j++) {
				destinationRegionIds.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationRegionIds["+ j +"]"));
			}
			routeMap.setDestinationRegionIds(destinationRegionIds);

			List<String> sourceRouteTableIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceRouteTableIds.Length"); j++) {
				sourceRouteTableIds.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SourceRouteTableIds["+ j +"]"));
			}
			routeMap.setSourceRouteTableIds(sourceRouteTableIds);

			List<String> matchCommunitySet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].MatchCommunitySet.Length"); j++) {
				matchCommunitySet.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].MatchCommunitySet["+ j +"]"));
			}
			routeMap.setMatchCommunitySet(matchCommunitySet);

			List<String> prependAsPath = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].PrependAsPath.Length"); j++) {
				prependAsPath.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].PrependAsPath["+ j +"]"));
			}
			routeMap.setPrependAsPath(prependAsPath);

			List<String> routeTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].RouteTypes.Length"); j++) {
				routeTypes.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].RouteTypes["+ j +"]"));
			}
			routeMap.setRouteTypes(routeTypes);

			List<String> originalRouteTableIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].OriginalRouteTableIds.Length"); j++) {
				originalRouteTableIds.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].OriginalRouteTableIds["+ j +"]"));
			}
			routeMap.setOriginalRouteTableIds(originalRouteTableIds);

			List<String> destinationChildInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationChildInstanceTypes.Length"); j++) {
				destinationChildInstanceTypes.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationChildInstanceTypes["+ j +"]"));
			}
			routeMap.setDestinationChildInstanceTypes(destinationChildInstanceTypes);

			List<String> destinationInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationInstanceIds.Length"); j++) {
				destinationInstanceIds.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].DestinationInstanceIds["+ j +"]"));
			}
			routeMap.setDestinationInstanceIds(destinationInstanceIds);

			List<String> matchAsns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].MatchAsns.Length"); j++) {
				matchAsns.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].MatchAsns["+ j +"]"));
			}
			routeMap.setMatchAsns(matchAsns);

			List<String> operateCommunitySet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].OperateCommunitySet.Length"); j++) {
				operateCommunitySet.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].OperateCommunitySet["+ j +"]"));
			}
			routeMap.setOperateCommunitySet(operateCommunitySet);

			List<String> srcZoneIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SrcZoneIds.Length"); j++) {
				srcZoneIds.add(_ctx.stringValue("DescribeCenRouteMapsResponse.RouteMaps["+ i +"].SrcZoneIds["+ j +"]"));
			}
			routeMap.setSrcZoneIds(srcZoneIds);

			routeMaps.add(routeMap);
		}
		describeCenRouteMapsResponse.setRouteMaps(routeMaps);
	 
	 	return describeCenRouteMapsResponse;
	}
}