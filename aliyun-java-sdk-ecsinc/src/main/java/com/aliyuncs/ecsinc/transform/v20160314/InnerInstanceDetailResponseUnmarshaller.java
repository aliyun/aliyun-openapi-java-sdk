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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.Group;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.Group.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.Img;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.Img.OsTypeModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.Img.OsTypeModel.Kind;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.Img.QuoteType;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.Img.Tag2;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.PublicIp;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.Data.StatusNote;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceDetailResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceDetailResponseUnmarshaller {

	public static InnerInstanceDetailResponse unmarshall(InnerInstanceDetailResponse innerInstanceDetailResponse, UnmarshallerContext context) {
		
		innerInstanceDetailResponse.setRequestId(context.stringValue("InnerInstanceDetailResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerInstanceDetailResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerInstanceDetailResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerInstanceDetailResponse.errorCode.isSuccess"));
		innerInstanceDetailResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setSystemDeviceCategory(context.stringValue("InnerInstanceDetailResponse.data.systemDeviceCategory"));
		data.setVncHost(context.stringValue("InnerInstanceDetailResponse.data.vncHost"));
		data.setIntensiveNet(context.integerValue("InnerInstanceDetailResponse.data.intensiveNet"));
		data.setSafetyQuota(context.stringValue("InnerInstanceDetailResponse.data.safetyQuota"));
		data.setVncPort(context.integerValue("InnerInstanceDetailResponse.data.vncPort"));
		data.setZoneNo(context.stringValue("InnerInstanceDetailResponse.data.zoneNo"));
		data.setInstanceName(context.stringValue("InnerInstanceDetailResponse.data.instanceName"));
		data.setRegionNo(context.stringValue("InnerInstanceDetailResponse.data.regionNo"));
		data.setHostname(context.stringValue("InnerInstanceDetailResponse.data.hostname"));
		data.setNetworkValidation(context.booleanValue("InnerInstanceDetailResponse.data.networkValidation"));
		data.setInternetTx(context.integerValue("InnerInstanceDetailResponse.data.internetTx"));
		data.setInternetRx(context.integerValue("InnerInstanceDetailResponse.data.internetRx"));
		data.setPlatform(context.stringValue("InnerInstanceDetailResponse.data.platform"));
		data.setVlanNo(context.stringValue("InnerInstanceDetailResponse.data.vlanNo"));
		data.setStatus(context.stringValue("InnerInstanceDetailResponse.data.status"));
		data.setCreationTime(context.stringValue("InnerInstanceDetailResponse.data.creationTime"));
		data.setMem(context.integerValue("InnerInstanceDetailResponse.data.mem"));
		data.setIntensiveIo(context.integerValue("InnerInstanceDetailResponse.data.intensiveIo"));
		data.setNcId(context.stringValue("InnerInstanceDetailResponse.data.ncId"));
		data.setBps(context.integerValue("InnerInstanceDetailResponse.data.bps"));
		data.setVncPassword(context.stringValue("InnerInstanceDetailResponse.data.vncPassword"));
		data.setEcsName(context.stringValue("InnerInstanceDetailResponse.data.ecsName"));
		data.setInnerIp(context.stringValue("InnerInstanceDetailResponse.data.innerIp"));
		data.setRealZoneNo(context.stringValue("InnerInstanceDetailResponse.data.realZoneNo"));
		data.setSerialNumber(context.stringValue("InnerInstanceDetailResponse.data.serialNumber"));
		data.setIzNo(context.stringValue("InnerInstanceDetailResponse.data.izNo"));
		data.setCores(context.integerValue("InnerInstanceDetailResponse.data.cores"));
		data.setIntranetTx(context.integerValue("InnerInstanceDetailResponse.data.intranetTx"));
		data.setIntensiveCpu(context.integerValue("InnerInstanceDetailResponse.data.intensiveCpu"));
		data.setImageProductCode(context.stringValue("InnerInstanceDetailResponse.data.imageProductCode"));
		data.setIntranetRx(context.integerValue("InnerInstanceDetailResponse.data.intranetRx"));
		data.setSecurityControl(context.stringValue("InnerInstanceDetailResponse.data.securityControl"));
		data.setRackId(context.stringValue("InnerInstanceDetailResponse.data.rackId"));
		data.setDisk(context.integerValue("InnerInstanceDetailResponse.data.disk"));

		PublicIp publicIp = new PublicIp();
		publicIp.setBindIp(context.stringValue("InnerInstanceDetailResponse.data.publicIp.bindIp"));
		publicIp.setAssignNatIp(context.stringValue("InnerInstanceDetailResponse.data.publicIp.assignNatIp"));
		publicIp.setAssignIp(context.stringValue("InnerInstanceDetailResponse.data.publicIp.assignIp"));
		data.setPublicIp(publicIp);

		Img img = new Img();
		img.setName(context.stringValue("InnerInstanceDetailResponse.data.img.name"));
		img.setImageId(context.stringValue("InnerInstanceDetailResponse.data.img.imageId"));
		img.setSrcImageId(context.longValue("InnerInstanceDetailResponse.data.img.srcImageId"));
		img.setGmtCreated(context.stringValue("InnerInstanceDetailResponse.data.img.gmtCreated"));
		img.setId(context.longValue("InnerInstanceDetailResponse.data.img.id"));
		img.setBid(context.stringValue("InnerInstanceDetailResponse.data.img.bid"));
		img.setVisibility(context.stringValue("InnerInstanceDetailResponse.data.img.visibility"));
		img.setRemark(context.stringValue("InnerInstanceDetailResponse.data.img.remark"));
		img.setSupportIoOptimizedInstance(context.booleanValue("InnerInstanceDetailResponse.data.img.supportIoOptimizedInstance"));
		img.setImportOSSObject(context.stringValue("InnerInstanceDetailResponse.data.img.importOSSObject"));
		img.setGmtModified(context.stringValue("InnerInstanceDetailResponse.data.img.gmtModified"));
		img.setProgress(context.stringValue("InnerInstanceDetailResponse.data.img.progress"));
		img.setVersion(context.stringValue("InnerInstanceDetailResponse.data.img.version"));
		img.setImageProductCode(context.stringValue("InnerInstanceDetailResponse.data.img.imageProductCode"));
		img.setAliUid(context.longValue("InnerInstanceDetailResponse.data.img.aliUid"));
		img.setGmtRelease(context.stringValue("InnerInstanceDetailResponse.data.img.gmtRelease"));
		img.setImageCategory(context.stringValue("InnerInstanceDetailResponse.data.img.imageCategory"));
		img.setDisplayName(context.stringValue("InnerInstanceDetailResponse.data.img.displayName"));
		img.setOwner(context.stringValue("InnerInstanceDetailResponse.data.img.owner"));
		img.setStatus(context.stringValue("InnerInstanceDetailResponse.data.img.status"));
		img.setImportOSSBucket(context.stringValue("InnerInstanceDetailResponse.data.img.importOSSBucket"));
		img.setFormat(context.stringValue("InnerInstanceDetailResponse.data.img.format"));
		img.setRegionNo(context.stringValue("InnerInstanceDetailResponse.data.img.regionNo"));
		img.setImageSize(context.integerValue("InnerInstanceDetailResponse.data.img.imageSize"));
		img.setSnapshotNo(context.stringValue("InnerInstanceDetailResponse.data.img.snapshotNo"));

		OsTypeModel osTypeModel = new OsTypeModel();
		osTypeModel.setPlatform(context.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.platform"));
		osTypeModel.setId(context.longValue("InnerInstanceDetailResponse.data.img.osTypeModel.id"));
		osTypeModel.setOsBit(context.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.osBit"));
		osTypeModel.setMinCpu(context.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.minCpu"));
		osTypeModel.setMinMemory(context.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.minMemory"));
		osTypeModel.setMaxCpu(context.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.maxCpu"));
		osTypeModel.setMaxMemory(context.integerValue("InnerInstanceDetailResponse.data.img.osTypeModel.maxMemory"));
		osTypeModel.setOsName(context.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.osName"));
		osTypeModel.setOsMemo(context.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.osMemo"));
		osTypeModel.setType(context.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.type"));

		Kind kind = new Kind();
		kind.setKind(context.stringValue("InnerInstanceDetailResponse.data.img.osTypeModel.kind.kind"));
		osTypeModel.setKind(kind);
		img.setOsTypeModel(osTypeModel);

		QuoteType quoteType = new QuoteType();
		quoteType.setQuoteType(context.stringValue("InnerInstanceDetailResponse.data.img.quoteType.quoteType"));
		img.setQuoteType(quoteType);

		List<Tag2> tags1 = new ArrayList<Tag2>();
		for (int i = 0; i < context.lengthValue("InnerInstanceDetailResponse.data.img.tags.Length"); i++) {
			Tag2 tag2 = new Tag2();
			tag2.setKey(context.stringValue("InnerInstanceDetailResponse.data.img.tags["+ i +"].key"));
			tag2.setValue(context.stringValue("InnerInstanceDetailResponse.data.img.tags["+ i +"].value"));

			tags1.add(tag2);
		}
		img.setTags1(tags1);
		data.setImg(img);

		StatusNote statusNote = new StatusNote();
		statusNote.setNoteCode(context.stringValue("InnerInstanceDetailResponse.data.statusNote.noteCode"));
		statusNote.setNoteInfo(context.stringValue("InnerInstanceDetailResponse.data.statusNote.noteInfo"));
		data.setStatusNote(statusNote);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("InnerInstanceDetailResponse.data.groups.Length"); i++) {
			Group group = new Group();
			group.setGroupNo(context.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].groupNo"));
			group.setGroupName(context.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].groupName"));
			group.setGroupDesc(context.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].groupDesc"));
			group.setEcsCount(context.integerValue("InnerInstanceDetailResponse.data.groups["+ i +"].ecsCount"));
			group.setVpcInstanceId(context.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].vpcInstanceId"));
			group.setGmtCreated(context.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].gmtCreated"));
			group.setGmtModified(context.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].gmtModified"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerInstanceDetailResponse.data.groups["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerInstanceDetailResponse.data.groups["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			group.setTags(tags);

			groups.add(group);
		}
		data.setGroups(groups);
		innerInstanceDetailResponse.setData(data);
	 
	 	return innerInstanceDetailResponse;
	}
}