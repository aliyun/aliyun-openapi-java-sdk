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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.GetStoryResponse;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.AddressesItem11;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AddressesItem22;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem34;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem34.CroppingSuggestionsItem38;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem34.CroppingSuggestionsItem38.Boundary39;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem34.ImageScore35;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem34.OCRContentsItem40;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioCoversItem34.OCRContentsItem40.Boundary41;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.AudioStreamsItem33;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.CroppingSuggestionsItem27;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.CroppingSuggestionsItem27.Boundary28;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.FiguresItem23;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.FiguresItem23.Boundary24;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.FiguresItem23.HeadPose25;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.ImageScore12;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.LabelsItem26;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.OCRContentsItem29;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.OCRContentsItem29.Boundary30;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.SubtitlesItem32;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.Cover.VideoStreamsItem31;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AddressesItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.CroppingSuggestionsItem7;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.CroppingSuggestionsItem7.Boundary8;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.ImageScore4;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.OCRContentsItem9;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioCoversItem.OCRContentsItem9.Boundary10;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.CroppingSuggestionsItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.CroppingSuggestionsItem.Boundary2;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.FiguresItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.FiguresItem.Boundary;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.FiguresItem.HeadPose;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.ImageScore;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.LabelsItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.OCRContentsItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.OCRContentsItem.Boundary3;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.GetStoryResponse.Story.FilesItem.VideoStreamsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStoryResponseUnmarshaller {

	public static GetStoryResponse unmarshall(GetStoryResponse getStoryResponse, UnmarshallerContext _ctx) {
		
		getStoryResponse.setRequestId(_ctx.stringValue("GetStoryResponse.RequestId"));

		Story story = new Story();
		story.setOwnerId(_ctx.stringValue("GetStoryResponse.Story.OwnerId"));
		story.setProjectName(_ctx.stringValue("GetStoryResponse.Story.ProjectName"));
		story.setDatasetName(_ctx.stringValue("GetStoryResponse.Story.DatasetName"));
		story.setObjectId(_ctx.stringValue("GetStoryResponse.Story.ObjectId"));
		story.setObjectType(_ctx.stringValue("GetStoryResponse.Story.ObjectType"));
		story.setUpdateTime(_ctx.stringValue("GetStoryResponse.Story.UpdateTime"));
		story.setCreateTime(_ctx.stringValue("GetStoryResponse.Story.CreateTime"));
		story.setStoryName(_ctx.stringValue("GetStoryResponse.Story.StoryName"));
		story.setStoryType(_ctx.stringValue("GetStoryResponse.Story.StoryType"));
		story.setStorySubType(_ctx.stringValue("GetStoryResponse.Story.StorySubType"));
		story.setStoryStartTime(_ctx.stringValue("GetStoryResponse.Story.StoryStartTime"));
		story.setStoryEndTime(_ctx.stringValue("GetStoryResponse.Story.StoryEndTime"));
		story.setCustomId(_ctx.stringValue("GetStoryResponse.Story.CustomId"));
		story.setCustomLabels(_ctx.mapValue("GetStoryResponse.Story.CustomLabels"));

		List<String> figureClusterIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.FigureClusterIds.Length"); i++) {
			figureClusterIds.add(_ctx.stringValue("GetStoryResponse.Story.FigureClusterIds["+ i +"]"));
		}
		story.setFigureClusterIds(figureClusterIds);

		Cover cover = new Cover();
		cover.setOwnerId(_ctx.stringValue("GetStoryResponse.Story.Cover.OwnerId"));
		cover.setProjectName(_ctx.stringValue("GetStoryResponse.Story.Cover.ProjectName"));
		cover.setDatasetName(_ctx.stringValue("GetStoryResponse.Story.Cover.DatasetName"));
		cover.setObjectType(_ctx.stringValue("GetStoryResponse.Story.Cover.ObjectType"));
		cover.setObjectId(_ctx.stringValue("GetStoryResponse.Story.Cover.ObjectId"));
		cover.setUpdateTime(_ctx.stringValue("GetStoryResponse.Story.Cover.UpdateTime"));
		cover.setCreateTime(_ctx.stringValue("GetStoryResponse.Story.Cover.CreateTime"));
		cover.setURI(_ctx.stringValue("GetStoryResponse.Story.Cover.URI"));
		cover.setOSSURI(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSURI"));
		cover.setFilename(_ctx.stringValue("GetStoryResponse.Story.Cover.Filename"));
		cover.setMediaType(_ctx.stringValue("GetStoryResponse.Story.Cover.MediaType"));
		cover.setContentType(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentType"));
		cover.setSize(_ctx.longValue("GetStoryResponse.Story.Cover.Size"));
		cover.setFileHash(_ctx.stringValue("GetStoryResponse.Story.Cover.FileHash"));
		cover.setFileModifiedTime(_ctx.stringValue("GetStoryResponse.Story.Cover.FileModifiedTime"));
		cover.setFileCreateTime(_ctx.stringValue("GetStoryResponse.Story.Cover.FileCreateTime"));
		cover.setFileAccessTime(_ctx.stringValue("GetStoryResponse.Story.Cover.FileAccessTime"));
		cover.setProduceTime(_ctx.stringValue("GetStoryResponse.Story.Cover.ProduceTime"));
		cover.setLatLong(_ctx.stringValue("GetStoryResponse.Story.Cover.LatLong"));
		cover.setTimezone(_ctx.stringValue("GetStoryResponse.Story.Cover.Timezone"));
		cover.setTravelClusterId(_ctx.stringValue("GetStoryResponse.Story.Cover.TravelClusterId"));
		cover.setOrientation(_ctx.longValue("GetStoryResponse.Story.Cover.Orientation"));
		cover.setFigureCount(_ctx.longValue("GetStoryResponse.Story.Cover.FigureCount"));
		cover.setTitle(_ctx.stringValue("GetStoryResponse.Story.Cover.Title"));
		cover.setImageWidth(_ctx.longValue("GetStoryResponse.Story.Cover.ImageWidth"));
		cover.setImageHeight(_ctx.longValue("GetStoryResponse.Story.Cover.ImageHeight"));
		cover.setEXIF(_ctx.stringValue("GetStoryResponse.Story.Cover.EXIF"));
		cover.setVideoWidth(_ctx.longValue("GetStoryResponse.Story.Cover.VideoWidth"));
		cover.setVideoHeight(_ctx.longValue("GetStoryResponse.Story.Cover.VideoHeight"));
		cover.setArtist(_ctx.stringValue("GetStoryResponse.Story.Cover.Artist"));
		cover.setAlbumArtist(_ctx.stringValue("GetStoryResponse.Story.Cover.AlbumArtist"));
		cover.setComposer(_ctx.stringValue("GetStoryResponse.Story.Cover.Composer"));
		cover.setPerformer(_ctx.stringValue("GetStoryResponse.Story.Cover.Performer"));
		cover.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.Language"));
		cover.setAlbum(_ctx.stringValue("GetStoryResponse.Story.Cover.Album"));
		cover.setPageCount(_ctx.longValue("GetStoryResponse.Story.Cover.PageCount"));
		cover.setDocumentText(_ctx.stringValue("GetStoryResponse.Story.Cover.DocumentText"));
		cover.setETag(_ctx.stringValue("GetStoryResponse.Story.Cover.ETag"));
		cover.setCacheControl(_ctx.stringValue("GetStoryResponse.Story.Cover.CacheControl"));
		cover.setContentDisposition(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentDisposition"));
		cover.setContentEncoding(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentEncoding"));
		cover.setContentLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentLanguage"));
		cover.setAccessControlAllowOrigin(_ctx.stringValue("GetStoryResponse.Story.Cover.AccessControlAllowOrigin"));
		cover.setAccessControlRequestMethod(_ctx.stringValue("GetStoryResponse.Story.Cover.AccessControlRequestMethod"));
		cover.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("GetStoryResponse.Story.Cover.ServerSideEncryptionCustomerAlgorithm"));
		cover.setServerSideEncryption(_ctx.stringValue("GetStoryResponse.Story.Cover.ServerSideEncryption"));
		cover.setServerSideDataEncryption(_ctx.stringValue("GetStoryResponse.Story.Cover.ServerSideDataEncryption"));
		cover.setServerSideEncryptionKeyId(_ctx.stringValue("GetStoryResponse.Story.Cover.ServerSideEncryptionKeyId"));
		cover.setOSSStorageClass(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSStorageClass"));
		cover.setOSSCRC64(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSCRC64"));
		cover.setObjectACL(_ctx.stringValue("GetStoryResponse.Story.Cover.ObjectACL"));
		cover.setContentMd5(_ctx.stringValue("GetStoryResponse.Story.Cover.ContentMd5"));
		cover.setOSSUserMeta(_ctx.mapValue("GetStoryResponse.Story.Cover.OSSUserMeta"));
		cover.setOSSTaggingCount(_ctx.longValue("GetStoryResponse.Story.Cover.OSSTaggingCount"));
		cover.setOSSTagging(_ctx.mapValue("GetStoryResponse.Story.Cover.OSSTagging"));
		cover.setOSSExpiration(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSExpiration"));
		cover.setOSSVersionId(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSVersionId"));
		cover.setOSSDeleteMarker(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSDeleteMarker"));
		cover.setOSSObjectType(_ctx.stringValue("GetStoryResponse.Story.Cover.OSSObjectType"));
		cover.setCustomId(_ctx.stringValue("GetStoryResponse.Story.Cover.CustomId"));
		cover.setCustomLabels(_ctx.mapValue("GetStoryResponse.Story.Cover.CustomLabels"));
		cover.setStreamCount(_ctx.longValue("GetStoryResponse.Story.Cover.StreamCount"));
		cover.setProgramCount(_ctx.longValue("GetStoryResponse.Story.Cover.ProgramCount"));
		cover.setFormatName(_ctx.stringValue("GetStoryResponse.Story.Cover.FormatName"));
		cover.setFormatLongName(_ctx.stringValue("GetStoryResponse.Story.Cover.FormatLongName"));
		cover.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Cover.StartTime"));
		cover.setBitrate(_ctx.longValue("GetStoryResponse.Story.Cover.Bitrate"));
		cover.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Cover.Duration"));

		ImageScore12 imageScore12 = new ImageScore12();
		imageScore12.setOverallQualityScore(_ctx.floatValue("GetStoryResponse.Story.Cover.ImageScore.OverallQualityScore"));
		cover.setImageScore12(imageScore12);

		List<AddressesItem22> addresses13 = new ArrayList<AddressesItem22>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.Addresses.Length"); i++) {
			AddressesItem22 addressesItem22 = new AddressesItem22();
			addressesItem22.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].Language"));
			addressesItem22.setAddressLine(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].AddressLine"));
			addressesItem22.setCountry(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].Country"));
			addressesItem22.setProvince(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].Province"));
			addressesItem22.setCity(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].City"));
			addressesItem22.setDistrict(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].District"));
			addressesItem22.setTownship(_ctx.stringValue("GetStoryResponse.Story.Cover.Addresses["+ i +"].Township"));

			addresses13.add(addressesItem22);
		}
		cover.setAddresses13(addresses13);

		List<FiguresItem23> figures14 = new ArrayList<FiguresItem23>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.Figures.Length"); i++) {
			FiguresItem23 figuresItem23 = new FiguresItem23();
			figuresItem23.setFigureId(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureId"));
			figuresItem23.setFigureConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureConfidence"));
			figuresItem23.setFigureClusterId(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureClusterId"));
			figuresItem23.setFigureClusterConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureClusterConfidence"));
			figuresItem23.setFigureType(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FigureType"));
			figuresItem23.setAge(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Age"));
			figuresItem23.setAgeSD(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].AgeSD"));
			figuresItem23.setGender(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Gender"));
			figuresItem23.setGenderConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].GenderConfidence"));
			figuresItem23.setEmotion(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Emotion"));
			figuresItem23.setEmotionConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].EmotionConfidence"));
			figuresItem23.setFaceQuality(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].FaceQuality"));
			figuresItem23.setMouth(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Mouth"));
			figuresItem23.setMouthConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].MouthConfidence"));
			figuresItem23.setBeard(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Beard"));
			figuresItem23.setBeardConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].BeardConfidence"));
			figuresItem23.setHat(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Hat"));
			figuresItem23.setHatConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].HatConfidence"));
			figuresItem23.setMask(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Mask"));
			figuresItem23.setMaskConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].MaskConfidence"));
			figuresItem23.setGlasses(_ctx.stringValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Glasses"));
			figuresItem23.setGlassesConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].GlassesConfidence"));
			figuresItem23.setSharpness(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Sharpness"));
			figuresItem23.setAttractive(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Attractive"));

			Boundary24 boundary24 = new Boundary24();
			boundary24.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Boundary.Width"));
			boundary24.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Boundary.Height"));
			boundary24.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Boundary.Left"));
			boundary24.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.Figures["+ i +"].Boundary.Top"));
			figuresItem23.setBoundary24(boundary24);

			HeadPose25 headPose25 = new HeadPose25();
			headPose25.setPitch(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].HeadPose.Pitch"));
			headPose25.setRoll(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].HeadPose.Roll"));
			headPose25.setYaw(_ctx.floatValue("GetStoryResponse.Story.Cover.Figures["+ i +"].HeadPose.Yaw"));
			figuresItem23.setHeadPose25(headPose25);

			figures14.add(figuresItem23);
		}
		cover.setFigures14(figures14);

		List<LabelsItem26> labels15 = new ArrayList<LabelsItem26>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.Labels.Length"); i++) {
			LabelsItem26 labelsItem26 = new LabelsItem26();
			labelsItem26.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.Labels["+ i +"].Language"));
			labelsItem26.setLabelName(_ctx.stringValue("GetStoryResponse.Story.Cover.Labels["+ i +"].LabelName"));
			labelsItem26.setLabelLevel(_ctx.longValue("GetStoryResponse.Story.Cover.Labels["+ i +"].LabelLevel"));
			labelsItem26.setLabelConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.Labels["+ i +"].LabelConfidence"));
			labelsItem26.setParentLabelName(_ctx.stringValue("GetStoryResponse.Story.Cover.Labels["+ i +"].ParentLabelName"));
			labelsItem26.setCentricScore(_ctx.floatValue("GetStoryResponse.Story.Cover.Labels["+ i +"].CentricScore"));

			labels15.add(labelsItem26);
		}
		cover.setLabels15(labels15);

		List<CroppingSuggestionsItem27> croppingSuggestions16 = new ArrayList<CroppingSuggestionsItem27>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.CroppingSuggestions.Length"); i++) {
			CroppingSuggestionsItem27 croppingSuggestionsItem27 = new CroppingSuggestionsItem27();
			croppingSuggestionsItem27.setAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].AspectRatio"));
			croppingSuggestionsItem27.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Confidence"));

			Boundary28 boundary28 = new Boundary28();
			boundary28.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Boundary.Width"));
			boundary28.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Boundary.Height"));
			boundary28.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Boundary.Left"));
			boundary28.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.CroppingSuggestions["+ i +"].Boundary.Top"));
			croppingSuggestionsItem27.setBoundary28(boundary28);

			croppingSuggestions16.add(croppingSuggestionsItem27);
		}
		cover.setCroppingSuggestions16(croppingSuggestions16);

		List<OCRContentsItem29> oCRContents17 = new ArrayList<OCRContentsItem29>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.OCRContents.Length"); i++) {
			OCRContentsItem29 oCRContentsItem29 = new OCRContentsItem29();
			oCRContentsItem29.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Language"));
			oCRContentsItem29.setContents(_ctx.stringValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Contents"));
			oCRContentsItem29.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Confidence"));

			Boundary30 boundary30 = new Boundary30();
			boundary30.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Boundary.Width"));
			boundary30.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Boundary.Height"));
			boundary30.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Boundary.Left"));
			boundary30.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.OCRContents["+ i +"].Boundary.Top"));
			oCRContentsItem29.setBoundary30(boundary30);

			oCRContents17.add(oCRContentsItem29);
		}
		cover.setOCRContents17(oCRContents17);

		List<VideoStreamsItem31> videoStreams18 = new ArrayList<VideoStreamsItem31>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.VideoStreams.Length"); i++) {
			VideoStreamsItem31 videoStreamsItem31 = new VideoStreamsItem31();
			videoStreamsItem31.setIndex(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Index"));
			videoStreamsItem31.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Language"));
			videoStreamsItem31.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecName"));
			videoStreamsItem31.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecLongName"));
			videoStreamsItem31.setProfile(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Profile"));
			videoStreamsItem31.setCodecTimeBase(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecTimeBase"));
			videoStreamsItem31.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecTagString"));
			videoStreamsItem31.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].CodecTag"));
			videoStreamsItem31.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Width"));
			videoStreamsItem31.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Height"));
			videoStreamsItem31.setHasBFrames(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].HasBFrames"));
			videoStreamsItem31.setSampleAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].SampleAspectRatio"));
			videoStreamsItem31.setDisplayAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].DisplayAspectRatio"));
			videoStreamsItem31.setPixelFormat(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].PixelFormat"));
			videoStreamsItem31.setLevel(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Level"));
			videoStreamsItem31.setFrameRate(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].FrameRate"));
			videoStreamsItem31.setAverageFrameRate(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].AverageFrameRate"));
			videoStreamsItem31.setTimeBase(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].TimeBase"));
			videoStreamsItem31.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].StartTime"));
			videoStreamsItem31.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Duration"));
			videoStreamsItem31.setBitrate(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Bitrate"));
			videoStreamsItem31.setFrameCount(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].FrameCount"));
			videoStreamsItem31.setRotate(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].Rotate"));
			videoStreamsItem31.setBitDepth(_ctx.longValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].BitDepth"));
			videoStreamsItem31.setColorSpace(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].ColorSpace"));
			videoStreamsItem31.setColorRange(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].ColorRange"));
			videoStreamsItem31.setColorTransfer(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].ColorTransfer"));
			videoStreamsItem31.setColorPrimaries(_ctx.stringValue("GetStoryResponse.Story.Cover.VideoStreams["+ i +"].ColorPrimaries"));

			videoStreams18.add(videoStreamsItem31);
		}
		cover.setVideoStreams18(videoStreams18);

		List<SubtitlesItem32> subtitles19 = new ArrayList<SubtitlesItem32>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.Subtitles.Length"); i++) {
			SubtitlesItem32 subtitlesItem32 = new SubtitlesItem32();
			subtitlesItem32.setIndex(_ctx.longValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Index"));
			subtitlesItem32.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Language"));
			subtitlesItem32.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].CodecName"));
			subtitlesItem32.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].CodecLongName"));
			subtitlesItem32.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].CodecTagString"));
			subtitlesItem32.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].CodecTag"));
			subtitlesItem32.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].StartTime"));
			subtitlesItem32.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Duration"));
			subtitlesItem32.setBitrate(_ctx.longValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Bitrate"));
			subtitlesItem32.setContent(_ctx.stringValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Content"));
			subtitlesItem32.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Width"));
			subtitlesItem32.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.Subtitles["+ i +"].Height"));

			subtitles19.add(subtitlesItem32);
		}
		cover.setSubtitles19(subtitles19);

		List<AudioStreamsItem33> audioStreams20 = new ArrayList<AudioStreamsItem33>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.AudioStreams.Length"); i++) {
			AudioStreamsItem33 audioStreamsItem33 = new AudioStreamsItem33();
			audioStreamsItem33.setIndex(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Index"));
			audioStreamsItem33.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Language"));
			audioStreamsItem33.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecName"));
			audioStreamsItem33.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecLongName"));
			audioStreamsItem33.setCodecTimeBase(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecTimeBase"));
			audioStreamsItem33.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecTagString"));
			audioStreamsItem33.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].CodecTag"));
			audioStreamsItem33.setTimeBase(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].TimeBase"));
			audioStreamsItem33.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].StartTime"));
			audioStreamsItem33.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Duration"));
			audioStreamsItem33.setBitrate(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Bitrate"));
			audioStreamsItem33.setFrameCount(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].FrameCount"));
			audioStreamsItem33.setLyric(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Lyric"));
			audioStreamsItem33.setSampleFormat(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].SampleFormat"));
			audioStreamsItem33.setSampleRate(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].SampleRate"));
			audioStreamsItem33.setChannels(_ctx.longValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].Channels"));
			audioStreamsItem33.setChannelLayout(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioStreams["+ i +"].ChannelLayout"));

			audioStreams20.add(audioStreamsItem33);
		}
		cover.setAudioStreams20(audioStreams20);

		List<AudioCoversItem34> audioCovers21 = new ArrayList<AudioCoversItem34>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Cover.AudioCovers.Length"); i++) {
			AudioCoversItem34 audioCoversItem34 = new AudioCoversItem34();
			audioCoversItem34.setImageWidth(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].ImageWidth"));
			audioCoversItem34.setImageHeight(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].ImageHeight"));
			audioCoversItem34.setEXIF(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].EXIF"));

			ImageScore35 imageScore35 = new ImageScore35();
			imageScore35.setOverallQualityScore(_ctx.floatValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].ImageScore.OverallQualityScore"));
			audioCoversItem34.setImageScore35(imageScore35);

			List<CroppingSuggestionsItem38> croppingSuggestions36 = new ArrayList<CroppingSuggestionsItem38>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem38 croppingSuggestionsItem38 = new CroppingSuggestionsItem38();
				croppingSuggestionsItem38.setAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem38.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Confidence"));

				Boundary39 boundary39 = new Boundary39();
				boundary39.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary39.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary39.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary39.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem38.setBoundary39(boundary39);

				croppingSuggestions36.add(croppingSuggestionsItem38);
			}
			audioCoversItem34.setCroppingSuggestions36(croppingSuggestions36);

			List<OCRContentsItem40> oCRContents37 = new ArrayList<OCRContentsItem40>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents.Length"); j++) {
				OCRContentsItem40 oCRContentsItem40 = new OCRContentsItem40();
				oCRContentsItem40.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Language"));
				oCRContentsItem40.setContents(_ctx.stringValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Contents"));
				oCRContentsItem40.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Confidence"));

				Boundary41 boundary41 = new Boundary41();
				boundary41.setWidth(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Width"));
				boundary41.setHeight(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Height"));
				boundary41.setLeft(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Left"));
				boundary41.setTop(_ctx.longValue("GetStoryResponse.Story.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem40.setBoundary41(boundary41);

				oCRContents37.add(oCRContentsItem40);
			}
			audioCoversItem34.setOCRContents37(oCRContents37);

			audioCovers21.add(audioCoversItem34);
		}
		cover.setAudioCovers21(audioCovers21);
		story.setCover(cover);

		List<FilesItem> files = new ArrayList<FilesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Files.Length"); i++) {
			FilesItem filesItem = new FilesItem();
			filesItem.setOwnerId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OwnerId"));
			filesItem.setProjectName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ProjectName"));
			filesItem.setDatasetName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].DatasetName"));
			filesItem.setObjectType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ObjectType"));
			filesItem.setObjectId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ObjectId"));
			filesItem.setUpdateTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].UpdateTime"));
			filesItem.setCreateTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].CreateTime"));
			filesItem.setURI(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].URI"));
			filesItem.setOSSURI(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSURI"));
			filesItem.setFilename(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Filename"));
			filesItem.setMediaType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].MediaType"));
			filesItem.setContentType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentType"));
			filesItem.setSize(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Size"));
			filesItem.setFileHash(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FileHash"));
			filesItem.setFileModifiedTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FileModifiedTime"));
			filesItem.setFileCreateTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FileCreateTime"));
			filesItem.setFileAccessTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FileAccessTime"));
			filesItem.setProduceTime(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ProduceTime"));
			filesItem.setLatLong(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].LatLong"));
			filesItem.setTimezone(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Timezone"));
			filesItem.setTravelClusterId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].TravelClusterId"));
			filesItem.setOrientation(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Orientation"));
			filesItem.setFigureCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].FigureCount"));
			filesItem.setTitle(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Title"));
			filesItem.setImageWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].ImageWidth"));
			filesItem.setImageHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].ImageHeight"));
			filesItem.setEXIF(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].EXIF"));
			filesItem.setVideoWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoWidth"));
			filesItem.setVideoHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoHeight"));
			filesItem.setArtist(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Artist"));
			filesItem.setAlbumArtist(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AlbumArtist"));
			filesItem.setComposer(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Composer"));
			filesItem.setPerformer(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Performer"));
			filesItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Language"));
			filesItem.setAlbum(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Album"));
			filesItem.setPageCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].PageCount"));
			filesItem.setDocumentText(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].DocumentText"));
			filesItem.setETag(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ETag"));
			filesItem.setCacheControl(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].CacheControl"));
			filesItem.setContentDisposition(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentDisposition"));
			filesItem.setContentEncoding(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentEncoding"));
			filesItem.setContentLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentLanguage"));
			filesItem.setAccessControlAllowOrigin(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AccessControlAllowOrigin"));
			filesItem.setAccessControlRequestMethod(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AccessControlRequestMethod"));
			filesItem.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ServerSideEncryptionCustomerAlgorithm"));
			filesItem.setServerSideEncryption(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ServerSideEncryption"));
			filesItem.setServerSideDataEncryption(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ServerSideDataEncryption"));
			filesItem.setServerSideEncryptionKeyId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ServerSideEncryptionKeyId"));
			filesItem.setOSSStorageClass(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSStorageClass"));
			filesItem.setOSSCRC64(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSCRC64"));
			filesItem.setObjectACL(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ObjectACL"));
			filesItem.setContentMd5(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].ContentMd5"));
			filesItem.setOSSUserMeta(_ctx.mapValue("GetStoryResponse.Story.Files["+ i +"].OSSUserMeta"));
			filesItem.setOSSTaggingCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OSSTaggingCount"));
			filesItem.setOSSTagging(_ctx.mapValue("GetStoryResponse.Story.Files["+ i +"].OSSTagging"));
			filesItem.setOSSExpiration(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSExpiration"));
			filesItem.setOSSVersionId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSVersionId"));
			filesItem.setOSSDeleteMarker(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSDeleteMarker"));
			filesItem.setOSSObjectType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OSSObjectType"));
			filesItem.setCustomId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].CustomId"));
			filesItem.setCustomLabels(_ctx.mapValue("GetStoryResponse.Story.Files["+ i +"].CustomLabels"));
			filesItem.setStreamCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].StreamCount"));
			filesItem.setProgramCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].ProgramCount"));
			filesItem.setFormatName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FormatName"));
			filesItem.setFormatLongName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].FormatLongName"));
			filesItem.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].StartTime"));
			filesItem.setBitrate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Bitrate"));
			filesItem.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].Duration"));

			ImageScore imageScore = new ImageScore();
			imageScore.setOverallQualityScore(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].ImageScore.OverallQualityScore"));
			filesItem.setImageScore(imageScore);

			List<AddressesItem> addresses1 = new ArrayList<AddressesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].Addresses.Length"); j++) {
				AddressesItem addressesItem = new AddressesItem();
				addressesItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].Language"));
				addressesItem.setAddressLine(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].AddressLine"));
				addressesItem.setCountry(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].Country"));
				addressesItem.setProvince(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].Province"));
				addressesItem.setCity(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].City"));
				addressesItem.setDistrict(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].District"));
				addressesItem.setTownship(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Addresses["+ j +"].Township"));

				addresses1.add(addressesItem);
			}
			filesItem.setAddresses1(addresses1);

			List<FiguresItem> figures = new ArrayList<FiguresItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].Figures.Length"); j++) {
				FiguresItem figuresItem = new FiguresItem();
				figuresItem.setFigureId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureId"));
				figuresItem.setFigureConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureConfidence"));
				figuresItem.setFigureClusterId(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureClusterId"));
				figuresItem.setFigureClusterConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureClusterConfidence"));
				figuresItem.setFigureType(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FigureType"));
				figuresItem.setAge(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Age"));
				figuresItem.setAgeSD(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].AgeSD"));
				figuresItem.setGender(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Gender"));
				figuresItem.setGenderConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].GenderConfidence"));
				figuresItem.setEmotion(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Emotion"));
				figuresItem.setEmotionConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].EmotionConfidence"));
				figuresItem.setFaceQuality(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].FaceQuality"));
				figuresItem.setMouth(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Mouth"));
				figuresItem.setMouthConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].MouthConfidence"));
				figuresItem.setBeard(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Beard"));
				figuresItem.setBeardConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].BeardConfidence"));
				figuresItem.setHat(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Hat"));
				figuresItem.setHatConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].HatConfidence"));
				figuresItem.setMask(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Mask"));
				figuresItem.setMaskConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].MaskConfidence"));
				figuresItem.setGlasses(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Glasses"));
				figuresItem.setGlassesConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].GlassesConfidence"));
				figuresItem.setSharpness(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Sharpness"));
				figuresItem.setAttractive(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Attractive"));

				Boundary boundary = new Boundary();
				boundary.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Boundary.Width"));
				boundary.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Boundary.Height"));
				boundary.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Boundary.Left"));
				boundary.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].Boundary.Top"));
				figuresItem.setBoundary(boundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Figures["+ j +"].HeadPose.Yaw"));
				figuresItem.setHeadPose(headPose);

				figures.add(figuresItem);
			}
			filesItem.setFigures(figures);

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].Language"));
				labelsItem.setLabelName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].LabelName"));
				labelsItem.setLabelLevel(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].LabelLevel"));
				labelsItem.setLabelConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].LabelConfidence"));
				labelsItem.setParentLabelName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].ParentLabelName"));
				labelsItem.setCentricScore(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].Labels["+ j +"].CentricScore"));

				labels.add(labelsItem);
			}
			filesItem.setLabels(labels);

			List<CroppingSuggestionsItem> croppingSuggestions = new ArrayList<CroppingSuggestionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem croppingSuggestionsItem = new CroppingSuggestionsItem();
				croppingSuggestionsItem.setAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Confidence"));

				Boundary2 boundary2 = new Boundary2();
				boundary2.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary2.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary2.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary2.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem.setBoundary2(boundary2);

				croppingSuggestions.add(croppingSuggestionsItem);
			}
			filesItem.setCroppingSuggestions(croppingSuggestions);

			List<OCRContentsItem> oCRContents = new ArrayList<OCRContentsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].OCRContents.Length"); j++) {
				OCRContentsItem oCRContentsItem = new OCRContentsItem();
				oCRContentsItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Language"));
				oCRContentsItem.setContents(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Contents"));
				oCRContentsItem.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Confidence"));

				Boundary3 boundary3 = new Boundary3();
				boundary3.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Boundary.Width"));
				boundary3.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Boundary.Height"));
				boundary3.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Boundary.Left"));
				boundary3.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem.setBoundary3(boundary3);

				oCRContents.add(oCRContentsItem);
			}
			filesItem.setOCRContents(oCRContents);

			List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams.Length"); j++) {
				VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
				videoStreamsItem.setIndex(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Index"));
				videoStreamsItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Language"));
				videoStreamsItem.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecName"));
				videoStreamsItem.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecLongName"));
				videoStreamsItem.setProfile(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Profile"));
				videoStreamsItem.setCodecTimeBase(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecTimeBase"));
				videoStreamsItem.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecTagString"));
				videoStreamsItem.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].CodecTag"));
				videoStreamsItem.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Width"));
				videoStreamsItem.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Height"));
				videoStreamsItem.setHasBFrames(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].HasBFrames"));
				videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].SampleAspectRatio"));
				videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].DisplayAspectRatio"));
				videoStreamsItem.setPixelFormat(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].PixelFormat"));
				videoStreamsItem.setLevel(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Level"));
				videoStreamsItem.setFrameRate(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].FrameRate"));
				videoStreamsItem.setAverageFrameRate(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].AverageFrameRate"));
				videoStreamsItem.setTimeBase(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].TimeBase"));
				videoStreamsItem.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].StartTime"));
				videoStreamsItem.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Duration"));
				videoStreamsItem.setBitrate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Bitrate"));
				videoStreamsItem.setFrameCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].FrameCount"));
				videoStreamsItem.setRotate(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].Rotate"));
				videoStreamsItem.setBitDepth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].BitDepth"));
				videoStreamsItem.setColorSpace(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].ColorSpace"));
				videoStreamsItem.setColorRange(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].ColorRange"));
				videoStreamsItem.setColorTransfer(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].ColorTransfer"));
				videoStreamsItem.setColorPrimaries(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].VideoStreams["+ j +"].ColorPrimaries"));

				videoStreams.add(videoStreamsItem);
			}
			filesItem.setVideoStreams(videoStreams);

			List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].Subtitles.Length"); j++) {
				SubtitlesItem subtitlesItem = new SubtitlesItem();
				subtitlesItem.setIndex(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Index"));
				subtitlesItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Language"));
				subtitlesItem.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].CodecName"));
				subtitlesItem.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].CodecLongName"));
				subtitlesItem.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].CodecTagString"));
				subtitlesItem.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].CodecTag"));
				subtitlesItem.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].StartTime"));
				subtitlesItem.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Duration"));
				subtitlesItem.setBitrate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Bitrate"));
				subtitlesItem.setContent(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Content"));
				subtitlesItem.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Width"));
				subtitlesItem.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].Subtitles["+ j +"].Height"));

				subtitles.add(subtitlesItem);
			}
			filesItem.setSubtitles(subtitles);

			List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams.Length"); j++) {
				AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
				audioStreamsItem.setIndex(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Index"));
				audioStreamsItem.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Language"));
				audioStreamsItem.setCodecName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecName"));
				audioStreamsItem.setCodecLongName(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecLongName"));
				audioStreamsItem.setCodecTimeBase(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecTimeBase"));
				audioStreamsItem.setCodecTagString(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecTagString"));
				audioStreamsItem.setCodecTag(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].CodecTag"));
				audioStreamsItem.setTimeBase(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].TimeBase"));
				audioStreamsItem.setStartTime(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].StartTime"));
				audioStreamsItem.setDuration(_ctx.doubleValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Duration"));
				audioStreamsItem.setBitrate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Bitrate"));
				audioStreamsItem.setFrameCount(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].FrameCount"));
				audioStreamsItem.setLyric(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Lyric"));
				audioStreamsItem.setSampleFormat(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].SampleFormat"));
				audioStreamsItem.setSampleRate(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].SampleRate"));
				audioStreamsItem.setChannels(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].Channels"));
				audioStreamsItem.setChannelLayout(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioStreams["+ j +"].ChannelLayout"));

				audioStreams.add(audioStreamsItem);
			}
			filesItem.setAudioStreams(audioStreams);

			List<AudioCoversItem> audioCovers = new ArrayList<AudioCoversItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers.Length"); j++) {
				AudioCoversItem audioCoversItem = new AudioCoversItem();
				audioCoversItem.setImageWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].ImageWidth"));
				audioCoversItem.setImageHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].ImageHeight"));
				audioCoversItem.setEXIF(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].EXIF"));

				ImageScore4 imageScore4 = new ImageScore4();
				imageScore4.setOverallQualityScore(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].ImageScore.OverallQualityScore"));
				audioCoversItem.setImageScore4(imageScore4);

				List<CroppingSuggestionsItem7> croppingSuggestions5 = new ArrayList<CroppingSuggestionsItem7>();
				for (int k = 0; k < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions.Length"); k++) {
					CroppingSuggestionsItem7 croppingSuggestionsItem7 = new CroppingSuggestionsItem7();
					croppingSuggestionsItem7.setAspectRatio(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].AspectRatio"));
					croppingSuggestionsItem7.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Confidence"));

					Boundary8 boundary8 = new Boundary8();
					boundary8.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Width"));
					boundary8.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Height"));
					boundary8.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Left"));
					boundary8.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Top"));
					croppingSuggestionsItem7.setBoundary8(boundary8);

					croppingSuggestions5.add(croppingSuggestionsItem7);
				}
				audioCoversItem.setCroppingSuggestions5(croppingSuggestions5);

				List<OCRContentsItem9> oCRContents6 = new ArrayList<OCRContentsItem9>();
				for (int k = 0; k < _ctx.lengthValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents.Length"); k++) {
					OCRContentsItem9 oCRContentsItem9 = new OCRContentsItem9();
					oCRContentsItem9.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Language"));
					oCRContentsItem9.setContents(_ctx.stringValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Contents"));
					oCRContentsItem9.setConfidence(_ctx.floatValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Confidence"));

					Boundary10 boundary10 = new Boundary10();
					boundary10.setWidth(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Width"));
					boundary10.setHeight(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Height"));
					boundary10.setLeft(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Left"));
					boundary10.setTop(_ctx.longValue("GetStoryResponse.Story.Files["+ i +"].AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Top"));
					oCRContentsItem9.setBoundary10(boundary10);

					oCRContents6.add(oCRContentsItem9);
				}
				audioCoversItem.setOCRContents6(oCRContents6);

				audioCovers.add(audioCoversItem);
			}
			filesItem.setAudioCovers(audioCovers);

			files.add(filesItem);
		}
		story.setFiles(files);

		List<AddressesItem11> addresses = new ArrayList<AddressesItem11>();
		for (int i = 0; i < _ctx.lengthValue("GetStoryResponse.Story.Addresses.Length"); i++) {
			AddressesItem11 addressesItem11 = new AddressesItem11();
			addressesItem11.setLanguage(_ctx.stringValue("GetStoryResponse.Story.Addresses["+ i +"].Language"));
			addressesItem11.setAddressLine(_ctx.stringValue("GetStoryResponse.Story.Addresses["+ i +"].AddressLine"));
			addressesItem11.setCountry(_ctx.stringValue("GetStoryResponse.Story.Addresses["+ i +"].Country"));
			addressesItem11.setProvince(_ctx.stringValue("GetStoryResponse.Story.Addresses["+ i +"].Province"));
			addressesItem11.setCity(_ctx.stringValue("GetStoryResponse.Story.Addresses["+ i +"].City"));
			addressesItem11.setDistrict(_ctx.stringValue("GetStoryResponse.Story.Addresses["+ i +"].District"));
			addressesItem11.setTownship(_ctx.stringValue("GetStoryResponse.Story.Addresses["+ i +"].Township"));

			addresses.add(addressesItem11);
		}
		story.setAddresses(addresses);
		getStoryResponse.setStory(story);
	 
	 	return getStoryResponse;
	}
}